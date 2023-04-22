package Semana_6;

import java.io.*;

public class RodrigoPorras_LuisQuiros_DerekChavarria_Entregable2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] angs) throws Exception {

        int puntaje_total = 0, num_de_juegos, marcador_equipo = 0, marcardor_rival = 0, i = 0;
        String nombre_equipo = "", nombre_rival = "", snitch_equipo = "", snitch_rival = "", resultado_final = "";

        out.println("\n-------------------------------");
        out.println("Bievenido al sistema del USQ");
        out.println("--------------------------------- \n");

        // 1.incializamos arreglo
        out.print("Ingrese el nombre del equipo: ");
        nombre_equipo = in.readLine();
        // 2.numJuegos
        out.print("Ingrese el numero de juegos: ");
        num_de_juegos = Integer.parseInt(in.readLine());

        out.print("\n--------------------------------- \n");

        while (i < num_de_juegos) {

            out.print("\nJuego " + (i + 1) + " contra: ");
            nombre_rival = in.readLine();

            out.print("Marcador de " + nombre_equipo + ": ");
            marcador_equipo = Integer.parseInt(in.readLine());

            out.print("Atrapó la snitch: ");
            snitch_equipo = in.readLine();

            if (snitch_equipo.equalsIgnoreCase("Si")) {

                snitch_equipo = marcador_equipo + " * ";

            } else {

                snitch_equipo = marcador_equipo + " ";

            }

            out.print("Marcador de " + nombre_rival + ": ");
            marcardor_rival = Integer.parseInt(in.readLine());

            out.print("Atrapó la snitch: ");
            snitch_rival = in.readLine();

            if (snitch_rival.equalsIgnoreCase("Si")) {

                snitch_rival = marcardor_rival + " * ";
            } else {

                snitch_rival = marcardor_rival + " ";

            }

            resultado_final = resultado_final + nombre_equipo + " vs " + nombre_rival + ":" + " " + snitch_equipo + "- "
                    + snitch_rival
                    + "\n";

            puntaje_total = puntaje_total + marcador_equipo;

            i = i + 1;

        }

        out.println("\n---------------------------------\n");

        out.println(resultado_final);

        out.println(
                "El puntaje total de " + nombre_equipo + " en todos los juegos es de: " + puntaje_total
                        + " puntos. \n");
    }
}