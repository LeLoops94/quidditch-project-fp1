Algoritmo sin_titulo
	Escribir 'Saludo y requisitos'
	Escribir 'Por favor ingrese la cantidad de puntos acumulados'
	Leer puntos_infracciones
	Si puntos_infracciones<=11 Entonces
		Escribir 'Su licencia no esta suspendida, puede renovar'
		Si puntos_infracciones<=4 Entonces
			Escribir 'Monto a pagar por la renovacion es de 5000 colones y tiene una vigencia de 6 annios'
			Escribir "Su usted desea renovar en el BCR, el banco le cobrara 4200 colones por el servicio, con un monto total del 9200 colones"
		SiNo
			Si puntos_infracciones>=5 Y puntos_infracciones<=8 Entonces
				Escribir 'Monto a pagar por la renovacion es de 10000 colones y tiene una vigencia de 4 annios'
				Escribir "Su usted desea renovar en el BCR, el banco le cobrara 4200 colones por el servicio, con un monto total del 14200 colones"
			SiNo
				Si puntos_infracciones>=9 Y puntos_infracciones<=11 Entonces
					Escribir 'Monto a pagar es de 10000 y tiene una vigencia de 3 annios'
					Escribir "Su usted desea renovar en el BCR, el banco le cobrara 4200 colones por el servicio, con un monto total del 14200 colones"
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir 'Su licencia esta suspendida, no puede renovar'
	FinSi
FinAlgoritmo
