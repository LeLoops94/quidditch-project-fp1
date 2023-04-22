package Semana_5;

import java.io.*;

public class proyecto_quidditch {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        /*
         * Haga un programa que lea el nombre de un equipo, el puntaje de todos los
         * partidos, el número de
         * juegos ejecutados y el número de oponentes diferentes, y calcule el puntaje
         * total que le corresponde
         * al equipo. El puntaje total se debe calcular teniendo en cuenta las
         * condiciones descritas
         * anteriormente
         */

        int equipos, num_de_juegos, num_oponentes, puntajes_partido;
        double puntaje_num_juegos, puntaje_num_oponentes, puntaje_total = 0;
        String nombre = "";

        out.println("---------------------------------");
        out.println("Bievenido al sistema del USQ");
        out.println("---------------------------------");
        out.println(
                "Desgloce de los equipos participantes: \n0. Maryland \n1. Texas Hill \n2. New York \n3. The Warriors \n4. The Lost Boys \n5. Boom Train");

        out.println("Por favor, ingrese el nombre del equipo que desea consultar: ");
        equipos = String.p (in.readLine())

        if (equipos >= 0 && equipos <= 5) {

            switch (equipos) {

                case 0:

                    nombre = "Maryland";
                    puntajes_partido = 640;
                    num_de_juegos = 7;
                    num_oponentes = 5;

                    break;

                case 1:

                    nombre = "Texas Hill";
                    puntajes_partido = 550;
                    num_de_juegos = 5;
                    num_oponentes = 4;

                    break;

                case 2:

                    nombre = "New York";
                    puntajes_partido = 220;
                    num_de_juegos = 4;
                    num_oponentes = 3;

                    break;

                case 3:

                    nombre = "The Warriors";
                    puntajes_partido = 130;
                    num_de_juegos = 3;
                    num_oponentes = 3;

                    break;

                case 4:

                    nombre = "The Lost Boys";
                    puntajes_partido = 120;
                    num_de_juegos = 2;
                    num_oponentes = 2;

                    break;

                case 5:

                    nombre = "Boom Train";
                    puntajes_partido = 60;
                    num_de_juegos = 1;
                    num_oponentes = 1;

                    break;

                default:

                    nombre = "";
                    puntajes_partido = 0;
                    num_de_juegos = 0;
                    num_oponentes = 0;

                    break;

            }

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

        }

        else {

        }

        if (puntaje_total > 0) {

            out.println("El puntaje total del equipo " + nombre + " es " + puntaje_total);

        } else {

            out.println("No ha ingresado un equipo valido, porfavor intentar de nuevo. ");

        }

    }

}
