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


program:
    part aux1{
        Program programa = new Program($part.parte,$aux1.partes);
        programa.toString();
    }; //Aquí tendríamos solo que crear el objeto de tipo program y hacer un print
aux1 returns [ArrayList<Part> partes]:
    part aux1 {
        $partes.add($part.parte);
    }
    | {
        //Primera que se ejecuta, fin de la recursividad
        $partes = new ArrayList<Part>();
    } ;
part returns [Part parte]:
    FUNCION type restpart{
        String tipo = $type.tipo;
        $parte = new Funcion($restpart.nombre,tipo,$restpart.variables,$restpart.sentencias);
    }
    | PROCEDIMIENTO restpart{
        $parte = new Procedimiento($restpart.nombre,$restpart.variables,$restpart.sentencias);
    };
restpart returns [String nombre, ArrayList<Parametro> variables, ArrayList<Sentencia> sentencias]:
    IDENTIFICADOR ABRIR_PARENTESIS aux2{
        $nombre = $IDENTIFICADOR.text;
        $variables = $aux2.parametros;
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
        $listparamAux.lista.add(param);
        $lista = $listparamAux.lista;
    };
listparamAux returns[ArrayList<Parametro> lista]:
    COMA type IDENTIFICADOR listparamAux{
        Parametro param = new Parametro($type.tipo, $IDENTIFICADOR.text);
        $lista.add(param); //no puedo probarlo porque no se compila aun
                                    //Pero esto aunque tiene sentido, no se si funcionara
                                    //Por ser la recursividad en una misma regla
                                    //Quiero añadir el param a la lista que me pasa lo de abajo justo
    }
    | {
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
        $sentlistAux.sentencias.add(s);
        $sentencias = $sentlistAux.sentencias;
    };
sentlistAux returns[ArrayList<Sentencia> sentencias]:
    sent sentlistAux {
        $sentencias.add($sent.sentencia);
    }
    | {
        $sentencias = new ArrayList<>();
    } ;
sent returns [Sentencia sentencia]:
        type lid PUNTO_Y_COMA{
            String tipo = $type.tipo;
            ArrayList<String> lid = $lid.identificadores;
            $sentencia = new Declaracion(tipo,lid); //Declaracion extends Sentencia
        }
        | IDENTIFICADOR aux3{
            String ident = $IDENTIFICADOR.text;
            ArrayList<String> aux3 = $aux3.asignacion;
            $sentencia = new Asignacion(ident,aux3); //Asignacion extends Sentencia
        }
        | RETURN exp PUNTO_Y_COMA{
            $sentencia = new Return($exp.expresion);
        }
        | BIFURCACION ABRIR_PARENTESIS lcond CERRAR_PARENTESIS ENTONCES blq SINO blq
        | BUCLEPARA ABRIR_PARENTESIS IDENTIFICADOR asig exp PUNTO_Y_COMA lcond PUNTO_Y_COMA IDENTIFICADOR asig exp CERRAR_PARENTESIS blq
        | BUCLEMIENTRAS ABRIR_PARENTESIS lcond CERRAR_PARENTESIS blq
        | BUCLE blq HASTA ABRIR_PARENTESIS lcond CERRAR_PARENTESIS
        | blq ;
aux3 returns [ArrayList<String> asignacion]:
    asig exp PUNTO_Y_COMA{
        $asignacion = new ArrayList<>();
        $asignacion.add($asig.s);
        $asignacion.addAll($exp.expresion);
        $asignacion.add(";");
    }
    | ABRIR_PARENTESIS aux4{
        $asignacion = new ArrayList<>();
        $asignacion.add("(");
        $asignacion.addAll($aux4.ids);
    };
aux4 returns [ArrayList<String> ids]:
    lid CERRAR_PARENTESIS PUNTO_Y_COMA{
        $ids = new ArrayList<>();
        $ids.addAll($lid.identificadores);
        $ids.add(")");
        $ids.add(";");
    }
    | CERRAR_PARENTESIS PUNTO_Y_COMA{
        $ids = new ArrayList<>();
        $ids.add(")");
        $ids.add(";");
    };
lid returns [ArrayList<String> identificadores]:
        IDENTIFICADOR aux5{
            $aux5.ids.add(0,$IDENTIFICADOR.text); //lo añadimos al inicio del todo
            $identificadores = $aux5.ids;
        };
aux5 returns [ArrayList<String> ids]:
            //$ids = $lid.identificadores
            //String coma = $COMA.text;
            //$aux5_text = coma + $lid.lid_text;
            //Eso que tenemos arriba es como estaba antes
            //Pero queremos el objeto no el texto, lo dejo para que se vea el ejemplo
        COMA lid {
            $ids = $lid.identificadores;
        }
        | {
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
exp returns [ArrayList<String> expresion]:
    IDENTIFICADOR aux6 expAux{
        $expresion = new ArrayList<>();
        $expresion.add($IDENTIFICADOR.text);
        $expresion.addAll($aux6.parametros);
        $expresion.addAll($expAux.expresiones);
    }
    | ABRIR_PARENTESIS exp CERRAR_PARENTESIS expAux{
        $expresion = new ArrayList<>();
        $expresion.add("(");
        $expresion.addAll($exp.expresion);
        $expresion.add(")");
        $expresion.addAll($expAux.expresiones);
    }
    | CONSTENTERO expAux{
        $expresion = new ArrayList<>();
        $expresion.add($CONSTENTERO.text);
        $expresion.addAll($expAux.expresiones);
    }
    | CONSTREAL expAux{
        $expresion = new ArrayList<>();
        $expresion.add($CONSTREAL.text);
        $expresion.addAll($expAux.expresiones);
    }
    | CONSTLIT expAux{
        $expresion = new ArrayList<>();
        $expresion.add($CONSTLIT.text);
        $expresion.addAll($expAux.expresiones);
    };
expAux returns [ArrayList<String> expresiones]:
    op exp expAux{
        $expresiones.add($op.operacion);
        $expresiones.addAll($exp.expresion);
        $expresiones.addAll($expAux.expresiones);
    }
    | {
        $expresiones = new ArrayList<>();
    };
aux6 returns [ArrayList<String> parametros]:
    ABRIR_PARENTESIS lid CERRAR_PARENTESIS{
        $parametros = new ArrayList<>();
        $parametros.add("(");
        $parametros.addAll($lid.identificadores);
        $parametros.add(")");
    }
    | {
        $parametros = new ArrayList<>();
    };
op returns [String operacion]:
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