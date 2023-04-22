Algoritmo Entregable_2
	Escribir "Bienvenido al sistema del USQ"
	i = 1
	Escribir "Ingrese el nombre del equipo: "
	Leer nombre_equipo
	Escribir "Ingrese el numero de juegos: "
	Leer num_de_juegos
	Mientras i < num_de_juegos Hacer
		Escribir "Juego " , i + 1 ,  " contra: "
		Leer nombre_rival
		Escribir "Marcador de " + nombre_equipo + ": "
		Leer marcador_equipo
		Escribir "Atrapo la snitch: "
		Leer snitch_equipo
		Si snitch_equipo == "Si" Entonces
			snitch_equipo = marcador_equipo + " * "
		SiNo
			snitch_equipo =  marcador_equipo + ""
		FinSi
		Escribir "Marcador de " + nombre_rival + ": "
		Leer marcador_rival
		Escribir "Atropo la snitch: "
		Leer snitch_rival
		Si snitch_rival == "Si" Entonces
			snitch_rival = marcador_rival + " * "
		SiNo
			snitch_rival = marcador_rival + ""
		FinSi
		resultado_final = resultado_final + nombre_equipo + " vs " + nombre_rival + ":" + " " + snitch_equipo + "- " + snitch_rival + "\n"
		puntaje_total = puntaje total , marcador_equipo
		i = i + 1
	FinMientras
	Escribir resultado_final
	Escribir "El puntaje total de " + nombre_equipo + " en todos los juegos es de: " + puntaje_total + " puntos."
FinAlgoritmo
