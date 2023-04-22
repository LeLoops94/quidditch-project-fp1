package Semana_6;

import java.io.*;

public class RodrigoPorras_LuisQuiros_DerekChavarria_Entregable1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] angs) throws Exception {

        int puntaje_total = 0, num_de_juegos, marcador_equipo = 0, marcardor_rival = 0, i = 0;
        String nombre_equipo = "", nombre_rival = "", snitch_equipo = "", snitch_rival = "", resultado_final = "";

        out.println("---------------------------------");
        out.println("Bievenido al sistema del USQ");
        out.println("---------------------------------");

        out.print("Ingrese el nombre del equipo: ");
        nombre_equipo = in.readLine();

        out.print("Ingrese el numero de juegos: ");
        num_de_juegos = Integer.parseInt(in.readLine());

        while (i < num_de_juegos) {

            out.println("Juego " + (i + 1) + " contra: ");
            nombre_rival = in.readLine();

            out.println("Marcador de " + nombre_equipo);
            marcador_equipo = Integer.parseInt(in.readLine());

            out.println("Atrapo la snitch: ");
            snitch_equipo = in.readLine();

            if (snitch_equipo.equals("Si")) {

                snitch_equipo = marcador_equipo + "*";

            } else {

                snitch_equipo = marcador_equipo + "";

            }

            out.println("Marcador de " + nombre_rival);
            marcardor_rival = Integer.parseInt(in.readLine());

            out.println("Atrapo la snitch: ");
            snitch_rival = in.readLine();

            if (snitch_rival.equals("Si")) {

                snitch_rival = marcardor_rival + "*";
            } else {

                snitch_rival = marcardor_rival + "";

            }

            i = i + 1;

            resultado_final = resultado_final + nombre_equipo + "vs" + nombre_rival + snitch_equipo + "-" + snitch_rival
                    + "\n";

            puntaje_total = puntaje_total + marcador_equipo;

        }

        out.println(resultado_final);

        out.println("El puntaje total del equipo de los juegos es: " + puntaje_total + " puntos!");
    }
}