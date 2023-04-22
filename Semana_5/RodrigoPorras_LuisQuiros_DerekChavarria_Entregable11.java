package Semana_5;

import java.io.*;

public class RodrigoPorras_LuisQuiros_DerekChavarria_Entregable11 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] angs) throws Exception {

        int num_de_juegos, num_oponentes, puntajes_partido;
        double puntaje_num_juegos, puntaje_num_oponentes, puntaje_total;
        String nombre;

        out.println("---------------------------------");
        out.println("Bievenido al sistema del USQ");
        out.println("---------------------------------");
        out.println(
                "Desgloce de los equipos participantes: \n0. Maryland \n1. Texas Hill \n2. New York \n3. The Warriors \n4. The Lost Boys \n5. Boom Train");

        // resultados
        out.println("Ingrese el nombre del equipo que desea saber eu total de puntos:");
        nombre = in.readLine();

        out.println("Ingrese la cantidad de puntos que obtuvo el equipo por los partidos:");
        puntajes_partido = Integer.parseInt(in.readLine());

        out.println("Ingrese el numero de juegos ejecutados por el equipo:");
        num_de_juegos = Integer.parseInt(in.readLine());

        out.println("Ingrese el numero de oponentes:");
        num_oponentes = Integer.parseInt(in.readLine());

        if (num_de_juegos >= 5) {

            puntaje_num_juegos = 1;

        } else {

            puntaje_num_juegos = (Math.sqrt(num_de_juegos) / 2.25);
        }

        if (num_oponentes == 1) {

            puntaje_num_oponentes = 1 / 3;

        } else if (num_oponentes == 2) {

            puntaje_num_oponentes = 2 / 3;

        } else {

            puntaje_num_oponentes = 1;

        }

        puntaje_total = puntajes_partido + puntaje_num_juegos + puntaje_num_oponentes;

        out.println("El puntaje total del equipo " + nombre + " es " + puntaje_total);

    }

}