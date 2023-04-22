package Semana_7;

import java.io.*;

public class LuisGabrielQuirosSoto_Tarea3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        /*
         * Se quiere hacer un programa para un colegio que quiere administrar las becas
         * y los equipos deportivos de
         * los estudiantes. Para esto el colegio está haciendo una encuesta a todos los
         * estudiantes de los cinco niveles del
         * colegio, en la cual pregunta el nivel en el que se encuentra el estudiante, a
         * cuál equipo quiere pertenecer: baloncesto,
         * natación, ajedrez o ninguno, y si el estudiante cuenta con beca o no. En caso
         * de contar con una beca, ésta puede ser
         * académica o deportiva, si el estudiante cuenta con beca académica el monto
         * que corresponde a la beca es de 50.000
         * colones por mes, pero si el estudiante cuenta con beca deportiva el monto que
         * corresponde a la beca es de 80.000
         * colones por mes. Dado el número de estudiantes encuestados, el programa debe
         * generar un reporte para el colegio
         * teniendo en cuenta lo siguiente:
         * • Total de estudiantes que contestaron la encuesta en cada nivel.
         * • El porcentaje total de estudiantes becados y de estudiantes no becados, en
         * el colegio.
         * • El monto total mensual y anual otorgado por becas deportivas, y el monto
         * total mensual y anual otorgado por becas
         * académicas. Suponga que las becas se otorgan de Febrero a Diciembre.
         * • El total de estudiantes que pertenecen a los equipos de baloncesto,
         * natación y ajedrez, y el total de estudiantes que
         * no pertenecen a ningún equipo
         */

        int total_estudiantes = 0, nivel, beca_academica = 50000, beca_deportiva = 80000;
        int total_estudiantes_nivel_1 = 0, total_estudiantes_nivel_2 = 0, total_estudiantes_nivel_3 = 0,
                total_estudiantes_nivel_4 = 0, total_estudiantes_nivel_5 = 0;
        int total_estudiantes_con_beca_deportiva = 0, total_estudiantes_con_beca_academica = 0;
        int monto_beca_deportiva_mensual, monto_beca_deportiva_anual, monto_beca_academica_mensual,
                monto_beca_academica_anual;
        int total_estudiantes_con_beca = 0, total_estudiantes_sin_beca = 0, porcetanje_estudiantes_con_beca,
                porcetanje_estudiantes_sin_beca;
        int total_estudiantes_baloncesto = 0, total_estudiantes_natacion = 0, total_estudiantes_ajedrez = 0,
                total_estudiantes_sin_equipo = 0;
        String equipo, posesion_beca, tipo_beca;

        out.println("---- Bienvenido/a al sistema de encuestas del Colegio Nueva Vista ----");
        out.println(" ");

        out.println("Indique la cantidad de estudiantes que haran la encuesta: ");
        total_estudiantes = Integer.parseInt(in.readLine());

        for (int i = 1; i <= total_estudiantes; i++) {

            out.println("---------------------------------");
            out.println("Encuesta");
            out.println("---------------------------------");

            out.println("Por favor indique su nivel correspondiente: ");
            nivel = Integer.parseInt(in.readLine());

            if (nivel == 1) {

                total_estudiantes_nivel_1 = total_estudiantes_nivel_1 + 1;

            } else if (nivel == 2) {

                total_estudiantes_nivel_2 = total_estudiantes_nivel_2 + 1;

            } else if (nivel == 3) {

                total_estudiantes_nivel_3 = total_estudiantes_nivel_3 + 1;

            } else if (nivel == 4) {

                total_estudiantes_nivel_4 = total_estudiantes_nivel_4 + 1;

            } else if (nivel == 5) {

                total_estudiantes_nivel_5 = total_estudiantes_nivel_5 + 1;

            }

            out.println("Por favor indique al equipo al que quiere pertenecer: ");
            equipo = in.readLine();

            if (equipo.equals("Baloncesto")) {

                total_estudiantes_baloncesto = total_estudiantes_baloncesto + 1;

            } else if (equipo.equals("Natacion")) {

                total_estudiantes_natacion = total_estudiantes_natacion + 1;

            } else if (equipo.equals("Ajedrez")) {

                total_estudiantes_ajedrez = total_estudiantes_ajedrez + 1;

            } else if (equipo.equals("Ninguno")) {

                total_estudiantes_sin_equipo = total_estudiantes_sin_equipo + 1;

            }

            out.println("Por favor indique si cuenta con una beca: ");
            posesion_beca = in.readLine();

            if (posesion_beca.equals("Si")) {

                out.println("Por favor indique el tipo de beca: ");
                tipo_beca = in.readLine();

                if (tipo_beca.equals("Deportiva")) {

                    total_estudiantes_con_beca_deportiva = total_estudiantes_con_beca_deportiva + 1;

                } else if (tipo_beca.equals("Academica")) {

                    total_estudiantes_con_beca_academica = total_estudiantes_con_beca_academica + 1;
                }

                total_estudiantes_con_beca = total_estudiantes_con_beca + 1;

            } else if (posesion_beca.equals("No")) {

                total_estudiantes_sin_beca = total_estudiantes_sin_beca + 1;
            }
        }

        out.println("Total de estudiantes en nivel 1 que hicieron la encuesta: " + total_estudiantes_nivel_1);
        out.println("Total de estudiantes en nivel 2 que hicieron la encuesta: " + total_estudiantes_nivel_2);
        out.println("Total de estudiantes en nivel 3 que hicieron la encuesta: " + total_estudiantes_nivel_3);
        out.println("Total de estudiantes en nivel 4 que hicieron la encuesta: " + total_estudiantes_nivel_4);
        out.println("Total de estudiantes en nivel 5 que hicieron la encuesta: " + total_estudiantes_nivel_5);

        out.println("Total de estudiantes en el equipo de baloncesto: " + total_estudiantes_baloncesto);
        out.println("Total de estudiantes en el equipo de natacion: " + total_estudiantes_natacion);
        out.println("Total de estudiantes en el equipo de ajedrez: " + total_estudiantes_ajedrez);
        out.println("Total de estudiantes que no pertenecen a un equipo: " + total_estudiantes_sin_equipo);

        porcetanje_estudiantes_con_beca = total_estudiantes_con_beca * 100 / total_estudiantes;
        out.println("Porcentaje de estudiantes becados : " + porcetanje_estudiantes_con_beca + "%");
        porcetanje_estudiantes_sin_beca = total_estudiantes_sin_beca * 100 / total_estudiantes;
        out.println("Porcentaje de estudiantes no becados : " + porcetanje_estudiantes_sin_beca + "%");

        monto_beca_deportiva_anual = beca_deportiva * total_estudiantes_con_beca_deportiva * 11;
        out.println("Monto anual de becas deportivas: " + monto_beca_deportiva_anual);
        monto_beca_academica_anual = beca_academica * total_estudiantes_con_beca_academica * 11;
        out.println("Monto anual de becas academicas: " + monto_beca_academica_anual);
        monto_beca_deportiva_mensual = beca_deportiva * total_estudiantes_con_beca_deportiva;
        out.println("Monto mensual de becas deportivas: " + monto_beca_deportiva_mensual);
        monto_beca_academica_mensual = beca_academica * total_estudiantes_con_beca_academica;
        out.println("Monto mensual de becas academicas: " + monto_beca_academica_mensual);

    }
}