grammar gramatica;

@parser::members {
    private Program programa;

    public gramaticaParser(TokenStream input, Program thePrograma){
        this(input);
        programa = thePrograma;
    }
}

//elementos del lenguaje
FUNCION: 'funcion';
PROCEDIMIENTO: 'procedimiento';
ABRIR_PARENTESIS: '(';
CERRAR_PARENTESIS: ')';
ENTERO: 'entero';
REAL: 'real';
CARACTER: 'caracter';
INICIO: 'inicio';
FIN: 'fin';
PUNTO_Y_COMA: ';';
RETURN: 'return';
COMA: ',';
IGUAL: '=';
MAS_IGUAL: '+=';
MENOS_IGUAL: '-=';
POR_IGUAL: '*=';
ENTRE_IGUAL: '/=';
MAS: '+';
MENOS: '-';
MULTIPLICACION: '*';
DIVISION: '/';
//parte opcional
BIFURCACION: 'bifurcacion';
ENTONCES: 'entonces';
SINO: 'sino';
BUCLEPARA: 'buclepara';
BUCLEMIENTRAS: 'buclemientras';
BUCLE: 'bucle';
HASTA: 'hasta';
NO: 'no';
CIERTO: 'cierto';
FALSO: 'falso';
Y: 'y';
O: 'o';
IGUAL_IGUAL: '==';
DISTINTO: '<>';
MENOR: '<';
MAYOR: '>';
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';

//constantes numericas
CONSTENTERO: [+-]?([0-9]+|'$'[0-9A-F]+);
CONSTREAL: [+-]?([0-9]+'.'[0-9]+|'$'[0-9A-F]+'.'[0-9A-F]+);

IDENTIFICADOR: [_a-z]+[a-zA-Z0-9()_]*;

//comentarios
LINE_COMENT: '%%'STUFF'\n';
MULTI_COMENT: '%-' (~[-]|'-'~[%])* '-%';

CONSTLIT: ('"' COMILLA_DOBLE '"'|'\'' COMILLA_SIMPLE '\'');

//expresiones regulares de ayuda
fragment
STUFF: (~[\n])+ ;
fragment
COMILLA_DOBLE: ('""'|~["])+;
fragment
COMILLA_SIMPLE: ('\'\''|~['])+;


program: part aux1; //Aquí tendríamos solo que crear el objeto de tipo program y hacer un print
aux1 returns [ArrayList<Part> partes]:
    part aux1 {
        $partes = $partes.add($part.parte);
    }
    |{
        //Primera que se ejecuta, fin de la recursividad
        $partes = new ArrayList<Part>();
    } ;
part returns [Part parte]:
    FUNCION type restpart{
        String tipo = $type.tipo;
        $parte = new Funcion($restpart.nombre,tipo,variables,sentencias);
    }
    | PROCEDIMIENTO restpart{
        $parte = new Procedimiento($restpart.nombre,variables,sentencias);
    };
restpart returns [String nombre, ArrayList<Parametro> variables, ArrayList<Sentencia> sentencias]:
    IDENTIFICADOR ABRIR_PARENTESIS aux2{
        $nombre = $IDENTIFICADOR.text;
        $variables = aux2.parametros;
        $sentencias = $aux2.listaSent;
    };
aux2 returns[ArrayList<Parametro> parametros, ArrayList<Sentencia> listaSent]: //FALTA TRATAR EL BLQ
    listparam CERRAR_PARENTESIS blq{
        $parametros = $listparam.lista;
        $listaSent = $blq.sentencias;
    }
    | CERRAR_PARENTESIS blq{
        $parametros = new ArrayList<>(); //Tambien podemos poner puntero a null si da problemas al construir
                                         //y así vemos que si la lista de params es null es que no tiene ninguno
        $listaSent = $blq.sentencias;
    };
listparam returns[ArrayList<Parametro> lista]:
    type IDENTIFICADOR listparamAux{
        Parametro param = new Parametro($type.tipo, $IDENTIFICADOR.text);
        $lista = $listparamAux.add(param);
    };
listparamAux returns[ArrayList<Parametro> lista]:
    COMA type IDENTIFICADOR listparamAux{
        Parametro param = new Parametro($type.tipo, $IDENTIFICADOR.text);
        $lista = $lista.add(param); //no puedo probarlo porque no se compila aun
                                    //Pero esto aunque tiene sentido, no se si funcionara
                                    //Por ser la recursividad en una misma regla
                                    //Quiero añadir el param a la lista que me pasa lo de abajo justo
    }
    |{
        $lista = new ArrayList<>();
    } ;
type returns [String tipo]:
    ENTERO{
       $tipo = $ENTERO.text;
    }
    | REAL{
       $tipo = $REAL.text;
    }
    | CARACTER{
       $tipo = $CARACTER.text;
    };
blq returns[ArrayList<Sentencia> sentencias]:
    INICIO sentlist FIN{
        $sentencias = $sentlist.sentencias;
    };

sentlist returns[ArrayList<Sentencia> sentencias]:
    sent sentlistAux{
        Sentencia s = $sent.sentencia;
        $sentencias = $sentListAux.sentencias.add(s);
    };
sentlistAux returns[ArrayList<Sentencia> sentencias]:
    sent sentlistAux {
        $sentencias = $sentencias.add($sent.sentencia);
    }
    |{
        $sentencias = new ArrayList<>;
    } ;
sent returns [Sentencia sentencia]:
        type lid PUNTO_Y_COMA{
            String tipo = $type.tipo;
            String lid = $lid.lid_text;
            $sentencia = new Declaracion(tipo,lid); //Declaracion extends Sentencia
        }
        | IDENTIFICADOR aux3{
            String ident = $IDENTIFICADOR.text;
        }
        | RETURN exp PUNTO_Y_COMA{
            $sentencia = new Return($exp.);
        }
        | BIFURCACION ABRIR_PARENTESIS lcond CERRAR_PARENTESIS ENTONCES blq SINO blq
        | BUCLEPARA ABRIR_PARENTESIS IDENTIFICADOR asig exp PUNTO_Y_COMA lcond PUNTO_Y_COMA IDENTIFICADOR asig exp CERRAR_PARENTESIS blq
        | BUCLEMIENTRAS ABRIR_PARENTESIS lcond CERRAR_PARENTESIS blq
        | BUCLE blq HASTA ABRIR_PARENTESIS lcond CERRAR_PARENTESIS
        | blq ;
aux3: asig exp PUNTO_Y_COMA | ABRIR_PARENTESIS aux4;
aux4 returns [String lid_comp]:
    lid CERRAR_PARENTESIS PUNTO_Y_COMA{
        $lid_comp = $lid.lid_text +");";
    }
    | CERRAR_PARENTESIS PUNTO_Y_COMA{
        $lid_comp = ");";
    };
lid returns [ArrayList<String> identificadores]:
        IDENTIFICADOR aux5{
            $identificadores = $aux5.ids.add(identificador);
        };
aux5 returns [ArrayList<String> ids]:
        COMA lid {
            //$ids = $lid.identificadores
            //String coma = $COMA.text;
            //$aux5_text = coma + $lid.lid_text;
            //Eso que tenemos arriba es como estaba antes
            //Pero queremos el objeto no el texto, lo dejo para que se vea el ejemplo

            $ids = $lid.identificadores
        }
        |{
           //la primera que va a reconocer por recursividad, creamos la lista vacia
           $ids = new ArrayList<String>();
        };
asig returns [String s]: IGUAL{
        $s = "=";
    }
    | MAS_IGUAL{
        $s = "+=";
    }
    | MENOS_IGUAL{
        $s = "-=";
    }
    | POR_IGUAL{
        $s = "*=";
    }
    | ENTRE_IGUAL{
        $s = "*=";
    };
exp : IDENTIFICADOR aux6 expAux
    | ABRIR_PARENTESIS exp CERRAR_PARENTESIS expAux
    | CONSTENTERO expAux
    | CONSTREAL expAux
    | CONSTLIT expAux;
expAux: op exp expAux | ;
aux6: ABRIR_PARENTESIS lid CERRAR_PARENTESIS | ;
op returns [string operacion]:
    MAS{
       $operacion = "+";
    }
    | MENOS{
       $operacion = "-";
    }
    | MULTIPLICACION{
       $operacion = "*";
    }
    | DIVISION{
       $operacion = "/";
    };

//parte opcional
lcond : cond lcondAux
        | NO cond;
lcondAux : opl lcond lcondAux | ;
cond : exp opr exp
        | CIERTO
        | FALSO;
opl : Y
    | O;
opr: IGUAL_IGUAL
    | DISTINTO
    | MENOR
    | MAYOR
    | MAYOR_IGUAL
    | MENOR_IGUAL;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip;