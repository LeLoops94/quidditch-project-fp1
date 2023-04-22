Algoritmo Prom_num_enteros
	contador = 1
	acumuladora = 0
	Escribir "Ingrese la cantidad de numeros a promediar: "
	Leer cantidad
	Mientras contador <= cantidad Hacer
		Escribir "Ingrese el numero entero: "
		Leer numero
		acumuladora = acumuladora + numero
		contador = contador + 1
	FinMientras
	promedio = acumuladora / cantidad
	Escribir "El promedio de los numeros es de: ", promedio
FinAlgoritmo
