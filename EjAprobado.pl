%% funcion para detectar identificadores y constantes numericas
funcion real ids_ctesnum ( real lado)
inicio
	real resultado,contador, contador1, acumulador_total_2, _contador3;
	resultado = +123 * -69 - 45;
	contador = ( $+123 / $-A6F9 ) + $FFFF;
	contador1 = +123.456 + ( -0.69 * 45.0 );
	acumulador_total_2 = ($+123.0 - ($-E.A6F9 / $0.FFFF));
	return resultado;
fin

%-
procedimiento para probar las constantes literales
-%
procedimiento ctescar ( real lado )
inicio
	caracter string;
	string = 'comilla doble " dentro';
	string = "comilla simple ' dentro";
	string = 'comilla simple '' dentro';
	string = "comilla doble "" dentro";
	string = 'comilla doble " y simple '' dentro';
	string = "comilla simple ' y doble "" dentro";
fin

funcion entero fun_con_parametros ( entero v1, real v2 )
inicio
	caracter aux;
	aux += 0;
	aux -= v1;
	v1 *= v2;
	proc_con_parametros (aux, v2 );
	v2 /= aux;
	return v2;
fin

funcion entero fun_sin_parametros ( )
inicio
	entero aux, aux1, aux2;
	aux1 = fun_con_parametros (aux1, aux2 );
	aux2 = 1;
	%% suma inutil
	return aux1 + aux2;
fin

procedimiento proc_con_parametros ( entero v1, real v2 )
inicio
	caracter aux;
	aux = 0;
	aux = v1;
	proc_sin_parametros ();
	v1 = v2;
	v2 = aux;
fin

procedimiento proc_sin_parametros ( )
inicio
	entero aux, aux1, aux2;
	aux1 = 0;
	aux2 = 1;
	%% suma inutil
	aux = aux1 + aux2;
fin