funcion real areaCuadrado ( real lado )
inicio
	real resultado;
	resultado = 0.0;
	resultado = lado * lado;
	return resultado;
fin

procedimiento intercambioEntero ( entero v1, entero v2 )
inicio
	entero aux;
	aux = 0;
	aux = v1;
	v1 = v2;
	v2 = aux;
fin

funcion entero factorialRec ( entero valorRec )
inicio
	bifurcacion ( valorRec == 1 )
	entonces
	inicio
		return 1;
	fin
	sino
	inicio
		entero auxRec;
		auxRec = valorRec - 1;
		return valorRec * factorialRec ( auxRec );
	fin
fin

funcion entero factorialIt ( entero valorIt )
inicio
	entero contador, acumulador;
	acumulador = 1;
	acumulador2 = 1;
	buclepara ( contador=0 ; contador == valorIt ; contador = contador + 1 )
	inicio
		acumulador = acumulador * contador;
		buclepara ( contador2=0 ; contador2 == valorIt ; contador2 = contador2 + 1 )
        	inicio
        		acumulador2 = acumulador2 * contador;
        	fin
	fin
	return acumulador;
fin





