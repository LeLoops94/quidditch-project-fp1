Algoritmo Encuesta
	Escribir 'Indique la cantidad de estudiantes que haran la encuesta: '
	Leer total_estudiantes
	Para i<-1 Hasta tota_estudiantes Hacer
		Escribir 'Por favor indique su nivel correspondiente: '
		Leer nivel
		Si nivel==1 Entonces
			total_estudiantes_nivel_1 <- total_estudiantes_nivel_1+1
		SiNo
			Si nivel==2 Entonces
				total_estudiantes_nivel_2 <- total_estudiantes_nivel_2+1
			SiNo
				Si nivel==3 Entonces
					total_estudiantes_nivel_3 <- total_estudiantes_nivel_3+1
				SiNo
					Si nivel==4 Entonces
						total_estudiantes_nivel_4 <- total_estudiantes_nivel_4+1
					SiNo
						Si nivel==5 Entonces
							total_estudiantes_nivel_5 <- total_estudiantes_nivel_5+1
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		Escribir 'Por favor indique al equipo al que quiere pertenecer: '
		Leer equipo
		Si equipo=='Baloncesto' Entonces
			total_estudiantes_baloncesto <- total_estudiantes_baloncesto+1
		SiNo
			Si equipo=='Natacion' Entonces
				total_estudiantes_natacion <- total_estudiantes_natacion+1
			SiNo
				Si equipo=='Ajedrez' Entonces
					total_estudiantes_ajedrez <- total_estudiantes_ajedrez+1
				SiNo
					Si equipo=='Ninguno' Entonces
						total_estudiantes_sin_equipo <- total_estudiantes_sin_equipo+1
					FinSi
				FinSi
			FinSi
		FinSi
		Escribir 'Por favor indique si cuenta con una beca: '
		Leer posesion_beca
		Si posesion_beca=='Si' Entonces
			total_estudiantes_con_beca <- total_estudiantes_con_beca+1
			Escribir 'Por favor indique el tipo de beca: '
			Leer tipo_beca
			Si tipo_beca=='Deportiva' Entonces
				total_estudiantes_con_beca_deportiva <- total_estudiantes_con_beca_deportiva+1
			SiNo
				Si tipo_beca=='Academica' Entonces
					total_estudiantes_con_beca_academica <- total_estudiantes_con_beca_academica+1
				FinSi
			FinSi
		SiNo
			Si posesion_beca=='No' Entonces
				total_estudiantes_sin_beca <- total_estudiantes_sin_beca+1
			FinSi
		FinSi
	FinPara
	Escribir 'Total de estudiantes en nivel 1 que hicieron la encuesta: '+total_estudiantes_nivel_1
	Escribir 'Total de estudiantes en nivel 2 que hicieron la encuesta: '+total_estudiantes_nivel_2
	Escribir 'Total de estudiantes en nivel 3 que hicieron la encuesta: '+total_estudiantes_nivel_3
	Escribir 'Total de estudiantes en nivel 4 que hicieron la encuesta: '+total_estudiantes_nivel_4
	Escribir 'Total de estudiantes en nivel 5 que hicieron la encuesta: '+total_estudiantes_nivel_5
	Escribir 'Total de estudiantes en el equipo de baloncesto: '+total_estudiantes_baloncesto
	Escribir 'Total de estudiantes en el equipo de natacion: '+total_estudiantes_natacion
	Escribir 'Total de estudiantes en el equipo de ajedrez: ',total-estudiantes_ajedrez
	Escribir 'Total de estudiantes que no perternecen a un equipo: '+total_estudiantes_sin_equipo
	porcentaje_estudiantes_con_beca <- total_estudiantes_con_beca*100/total_estudiantes
	Escribir 'Porcentaje de estudiantes becados: '+porcentaje_estudiantes_con_beca+'%'
	porcentaje_estudiantes_sin_beca <- total_estudiantes_sin_beca*100/total_estudiantes
	Escribir 'Porcentaje de estudiantes no becados: '+porcentaje_estudiantes_sin_beca+'%'
	monto_beca_deportiva_anual <- beca_deportiva*total_estudiantes_con_beca_deportiva*11
	Escribir 'Monto anual de becas deportivas: '+monto_beca_deportiva_anual
	monto_beca_academica_anual <- beca_academica*total_estudiantes_con_beca_academica*11
	Escribir 'Monto anual de becas academicas: '+monto_beca_academica_anual
	monto_beca_deportiva_mensual <- beca_deportiva*total_estudiantes_con_beca_deportiva
	Escribir 'Monto mensual de beca deportivas'
	monto_beca_academica_mensual <- beca_academica*total_estudiantes_con_beca_academica
	Escribir 'Monto mensual de becas academicas: '+monto_beca_academica_mensual
FinAlgoritmo
