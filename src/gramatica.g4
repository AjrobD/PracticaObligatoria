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
RETURN: 'return';

//constantes numericas
CONSTENTERO: [+-]?([0-9]+|'$'[0-9A-F]+);
CONSTREAL: [+-]?([0-9]+'.'[0-9]+|'$'[0-9A-F]+'.'[0-9A-F]);

IDENTIFICADOR: [_a-z]+[a-zA-Z0-9()_]*;

//esto hay que ponerlo bien
LINE_COMENT: '%%'STUFF'\n';
MULTI_COMENT: '%-' (~[-]|'-'~[%]) '-%';

CONSTLIT: ('"' COMILLA_DOBLE '"'|'\'' COMILLA_SIMPLE '\'');

fragment

STUFF: (~[\n]|~[\r])+ ;

fragment
COMILLA_DOBLE: ('""'|~["])+;
fragment
COMILLA_SIMPLE: ('\'\''|~['])+;


WS: [\n\r];
OTHER: [ a-zA-Z0-9?¿!*,;:.+\-@$%&()=<_/~\t|[\]#];