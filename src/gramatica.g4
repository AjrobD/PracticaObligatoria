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

//Especificación sintáctica con parte opcioanl incluida

program: part aux1;
aux1: part aux1 | ;
part: FUNCION type restpart
    | PROCEDIMIENTO restpart;
restpart : IDENTIFICADOR ABRIR_PARENTESIS aux2;
aux2: listparam CERRAR_PARENTESIS blq
    | CERRAR_PARENTESIS blq;
listparam: type IDENTIFICADOR listparamAux;
listparamAux: COMA type IDENTIFICADOR listparamAux | ;
type: ENTERO
    | REAL
    | CARACTER;
blq: INICIO sentlist FIN;

sentlist: sent sentlistAux;
sentlistAux : sent sentlistAux | ;
sent : type lid PUNTO_Y_COMA
        | IDENTIFICADOR aux3
        | RETURN exp PUNTO_Y_COMA
        | BIFURCACION ABRIR_PARENTESIS lcond CERRAR_PARENTESIS ENTONCES blq SINO blq
        | BUCLEPARA ABRIR_PARENTESIS IDENTIFICADOR asig exp PUNTO_Y_COMA lcond PUNTO_Y_COMA IDENTIFICADOR asig exp CERRAR_PARENTESIS blq
        | BUCLEMIENTRAS ABRIR_PARENTESIS lcond CERRAR_PARENTESIS blq
        | BUCLE blq HASTA ABRIR_PARENTESIS lcond CERRAR_PARENTESIS
        | blq ;
aux3: asig exp PUNTO_Y_COMA | ABRIR_PARENTESIS aux4;
aux4: lid CERRAR_PARENTESIS PUNTO_Y_COMA
    | CERRAR_PARENTESIS PUNTO_Y_COMA ;
lid : IDENTIFICADOR aux5;
aux5: COMA lid | ;
asig : IGUAL
        | MAS_IGUAL
        | MENOS_IGUAL
        | POR_IGUAL
        | ENTRE_IGUAL;
exp : IDENTIFICADOR aux6 expAux
    | ABRIR_PARENTESIS exp CERRAR_PARENTESIS expAux
    | CONSTENTERO expAux
    | CONSTREAL expAux
    | CONSTLIT expAux;
expAux: op exp expAux | ;
aux6: ABRIR_PARENTESIS lid CERRAR_PARENTESIS | ;
op : MAS
    | MENOS
    | MULTIPLICACION
    | DIVISION;

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