Algoritmo LicenciasFinal
	Definir puntos_infracciones Como Entero
	Definir renovacion,suspension,monto_y_vigencia,recargo_BCR Como Caracter
	Escribir 'Saludo y requisitos'
	Escribir 'Por favor ingrese la cantidad de puntos acumulados'
	Leer puntos_infracciones
	Si puntos_infracciones<=11 Entonces
		renovacion <- 'Su licencia no est� suspendida, puede renovar. Por ende: '
		Escribir renovacion
		Si puntos_infracciones<=4 Entonces
			monto_y_vigencia <- 'El monto a pagar por la renovaci�n es de 5000 colones, su licencia tendr� una vigencia de 6 a�os '
			recargo_BCR <- 'Su usted desea renovar en el BCR, el banco le cobrar� 4200 colones por el servicio, con un monto total de 9200 colones'
			Escribir monto_y_vigencia
			Escribir recargo_BCR
		SiNo
			Si puntos_infracciones>=5 Y puntos_infracciones<=8 Entonces
				monto_y_vigencia <- 'El monto a pagar por la renovaci�n es de 10000 colones, su licencia tendr� una vigencia de 4 a�os '
				recargo_BCR <- 'Su usted desea renovar en el BCR, el banco le cobrar� 4200 colones por el servicio, con un monto total de 14200 colones'
				Escribir monto_y_vigencia
				Escribir recargo_BCR
			SiNo
				Si puntos_infracciones>=9 Y puntos_infracciones<=11 Entonces
					monto_y_vigencia <- 'El monto a pagar por la renovaci�n es de 10000 colones, su licencia tendr� una vigencia de 3 a�os '
					recargo_BCR <- 'Su usted desea renovar en el BCR, el banco le cobrar� 4200 colones por el servicio, con un monto total de 14200 colones'
					Escribir monto_y_vigencia
					Escribir recargo_BCR
				FinSi
			FinSi
		FinSi
	SiNo
		suspension <- 'Su licencia est� suspendida, no puede renovar.'
		Escribir suspension
	FinSi
FinAlgoritmo
