grammar gramatica;
r: (FUNCION|PROCEDIMIENTO|ABRIR_PARENTESIS|CERRAR_PARENTESIS|ENTERO|REAL|CARACTER|INICIO|FIN|RETURN|CONSTENTERO|CONSTREAL|IDENTIFICADOR|CONSTLIT|LINE_COMENT|MULTI_COMENT|WS|OTHER)+;

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
BUCLEMIENTRIAS: 'buclemientras';
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


//WS: [\n\r];
//OTHER: [ a-zA-Z0-9?¿!*,;:.+\-@$%&()=<_/~\t|[\]#];

//Especificación sintáctica con parte opcioanl incluida
init: program;
program: part help1;
help1: program | ;
part: FUNCION type restpart
    | PROCEDIMIENTO restpart;
restpart : IDENTIFICADOR ABRIR_PARENTESIS listparam CERRAR_PARENTESIS blq
            | IDENTIFICADOR ABRIR_PARENTESIS CERRAR_PARENTESIS blq;
listparam: listparam COMA type IDENTIFICADOR
            | type IDENTIFICADOR;
type: ENTERO
    | REAL
    | CARACTER;
blq: INICIO sentlist FIN;

sentlist: sentlist sent
        | sent;
sent : type lid PUNTO_Y_COMA
        | IDENTIFICADOR asig exp PUNTO_Y_COMA
        | RETURN exp PUNTO_Y_COMA
        | IDENTIFICADOR ABRIR_PARENTESIS lid CERRAR_PARENTESIS PUNTO_Y_COMA 
        | IDENTIFICADOR ABRIR_PARENTESIS CERRAR_PARENTESIS PUNTO_Y_COMA
        | BIFURCACION ABRIR_PARENTESIS lcond CERRAR_PARENTESIS ENTONCES blq SINO blq
        | BUCLEPARA ABRIR_PARENTESIS IDENTIFICADOR asig exp PUNTO_Y_COMA lcond PUNTO_Y_COMA IDENTIFICADOR asig exp CERRAR_PARENTESIS blq
        | BUCLEMIENTRIAS ABRIR_PARENTESIS lcond CERRAR_PARENTESIS blq
        | BUCLE blq HASTA ABRIR_PARENTESIS lcond CERRAR_PARENTESIS | blq ;
lid : IDENTIFICADOR
    | IDENTIFICADOR COMA lid;
asig : IGUAL
        | MAS_IGUAL
        | MENOS_IGUAL
        | POR_IGUAL
        | ENTRE_IGUAL;
exp : exp op exp
    | IDENTIFICADOR ABRIR_PARENTESIS lid CERRAR_PARENTESIS
    | ABRIR_PARENTESIS exp CERRAR_PARENTESIS
    | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
op : MAS
    | MENOS
    | MULTIPLICACION
    | DIVISION;

//parte opcional
lcond : lcond opl lcond
        | cond
        | NO cond;
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