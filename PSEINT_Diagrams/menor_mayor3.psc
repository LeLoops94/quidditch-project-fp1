Algoritmo menor_mayor3
	Escribir 'Por favor ingrese el primer numero'
	Leer num1
	Escribir 'Por favor ingrese el segundo numero'
	Leer num2
	Escribir 'Por favor ingrese el tercer numero'
	Leer num3
	Si (num1<>num2) Y (num1<>num3) Y (num2<>num3) Entonces
		Si num1>num2 Y num1>num3 Entonces
			Escribir "El numero mayor es: ", num1
			Si num2<num3 Entonces
				Escribir "El numero menor es: ", num2
			SiNo
				Escribir "El numero menor es: ", num3
			FinSi
		SiNo
			Si num2>num3 Entonces
				Escribir "El numero mayor es: ", num2
				Si num1<num3 Entonces
					Escribir "El numero menor es: ", num1
				SiNo
					Escribir "El numero menor es: ", num3
				FinSi
			SiNo
				Escribir "El numero mayor es: ", num3
				Si num1<num2 Entonces
					Escribir "El numero menor es: ", num1
				SiNo
					Escribir "El numero menor es: ", num2
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir 'Los numero ingresados no son diferentes'
	FinSi
FinAlgoritmo
