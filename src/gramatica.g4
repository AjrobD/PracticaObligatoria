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
PUNTOYCOMA: ';';
RETURN: 'return';
COMA: ',';
IGUAL: '=';
MASIGUAL: '+=';
MENOSIGUAL: '-=';
PORIGUAL: '*=';
ENTREIGUAL: '/=';
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
IGUALIGUAL: '==';
DISTINTO: '<>';
MENOR: '<';
MAYOR: '>';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';

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


WS: [\n\r];
OTHER: [ a-zA-Z0-9?¿!*,;:.+\-@$%&()=<_/~\t|[\]#];

//Especificación sintáctica con parte opcioanl incluida
program : part program
        | part;
part: 'funcion' type restpart
    | 'procedimiento' restpart;
restpart : IDENTIFICADOR '(' listparam ')' blq
            | IDENTIFICADOR '(' ')' blq;
listparam: listparam ',' type IDENTIFICADOR
            | type IDENTIFICADOR;
type: 'entero'
    | 'real'
    | 'caracter';
blq: 'inicio' sentlist 'fin';

sentlist: sentlist sent
        | sent;
sent : type lid ';'
        | IDENTIFICADOR asig exp ';'
        | 'return' exp ';'
        | IDENTIFICADOR '(' lid ')'' ";"' | IDENTIFICADOR '(' ')' ';'
        | 'bifurcacion' '(' lcond ')' 'entonces' blq 'sino' blq
        | 'buclepara' '(' IDENTIFICADOR asig exp ';' lcond ';' IDENTIFICADOR asig exp ")" blq
        | 'buclemientras' '(' lcond ')' blq
        | 'bucle' blq 'hasta' '(' lcond ')' | blq ;
lid : IDENTIFICADOR
    | IDENTIFICADOR ',' lid;
asig : '='
        | '+='
        | '-='
        | '*='
        | '/=';
exp : exp op exp
    | IDENTIFICADOR '(' lid ')'
    | '(' exp ')'
    | IDENTIFICADOR | CONSTENTERO | CONSTREAL | CONSTLIT;
op : '+'
    | '-'
    | '*'
    | '/';

//parte opcional
lcond : lcond opl lcond
        | cond
        | 'no' cond;
cond : exp opr exp
        | 'cierto'
        | 'falso';
opl : 'y'
    | 'o';
opr: '=='
    | '<>'
    | '<'
    | '>'
    | '>='
    | '<=';