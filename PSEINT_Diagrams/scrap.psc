Algoritmo sin_titulo
	monto_energia ()
FinAlgoritmo

Funcion mes_mayor_consumo ()
	Definir consumo,consumo_mayor Como Real
	Definir mes_de_mayor_consumo,mes_a_ingresar Como Caracter
	Para i<-1 Hasta 6 Hacer
		Escribir 'Ingrese el nombre del mes ',(i+0),': '
		Leer mes_a_ingresar
		Escribir 'Ingrese la cantidad de KWH consumidos en el mes de '+mes_a_ingresar+': '
		Leer consumo
		Si consumo>consumo_mayor Entonces
			consumo_mayor <- consumo
			mes_de_mayor_consumo <- mes_a_ingresar
		FinSi
	FinPara
FinFuncion

Funcion monto_energia (total_consumo_punta,total_consumo_valle,total_consumo_nocturno)
	Definir costo_total,costo_horario_punta,costo_horario_valle,costo_horario_nocturno Como Real
	Si (total_consumo_punta <= 500) Entonces
	
		costo_horario_punta = costo_horario_punta + 1 + total_consumo_punta * 167.72;
		
	SiNo 
		
		Si (total_consumo_punta > 500) Entonces
	
		costo_horario_punta = costo_horario_punta + 1 + total_consumo_punta * 207.39;
	FinSi	
FinSi

Si (total_consumo_valle <= 500) Entonces
	
	costo_horario_valle = costo_horario_valle + 1 + total_consumo_punta * 68.75;
	
SiNo 
	
	Si (total_consumo_valle > 500) Entonces
		
		costo_horario_valle = costo_horario_valle + 1 + total_consumo_punta * 83.71;
	FinSi	
FinSi

Si (total_consumo_nocturno <= 500) Entonces
	
	costo_horario_nocturno = costo_horario_nocturno + 1 + total_consumo_punta * 28.77;
	
SiNo 
	
	Si (total_consumo_nocturno > 500) Entonces
		
		costo_horario_nocturno = costo_horario_nocturno + 1 + total_consumo_punta * 38.74;
	FinSi	
FinSi
	
costo_total = costo_horario_punta + costo_horario_valle + costo_horario_nocturno;	

retorno = costo_total

FinFuncion
