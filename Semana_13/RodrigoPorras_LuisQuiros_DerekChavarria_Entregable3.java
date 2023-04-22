package Semana_13;

import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class RodrigoPorras_LuisQuiros_DerekChavarria_Entregable3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    /*
     * public static void Menu() throws IOException {
     * int opcion;
     * int[] opcion_1 = null;
     * 
     * do {
     * 
     * out.print("\nElija una opcion: ");
     * opcion = Integer.parseInt(in.readLine());
     * 
     * switch (opcion) {
     * case 1:
     * 
     * opcion_1 = recibe_equipos();
     * 
     * break;
     * case 2:
     * 

     * } else {
     * out.println(
     * "\n\nIngrese algo en la opcion 1\n\n");
     * }
     * break;
     * case 3:
     * 
     * 
     * 
     * break;
     * case 4:
     * 
     * out.println("\n------------------------------------");
     * out.println("¡Hasta la proxima!");
     * out.println("------------------------------------");
     * break;
     * 
     * default:
     * out.println("\n------------------------");
     * out.println("Error: Opcion invalida");
     * out.println("------------------------");
     * }
     * 
     * } while (opcion != 4);
     * }
     */

    public static int recibe_equipos() throws IOException {

        int equipos;
        out.print("Ingrese el total de equipos: ");
        equipos = Integer.parseInt(in.readLine());
        return equipos;

    }

    public static void registro_torneo(int teams) throws IOException {

        String names_teams;
        int amount_games, amount_oponents;

        String nombres_equipos[] = new String[teams];
        int num_de_juegos[] = new int[teams];
        int num_de_oponentes[] = new int[teams];

        for (int i = 0; i < teams; i++) {

            out.print("Ingrese el nombre del equipo " + (i + 1) + " :");
            names_teams = in.readLine();

            out.print("Ingrese el numero de juegos jugado por el equipo numero: ");
            amount_games = Integer.parseInt(in.readLine());

            out.print("Ingrese el numero de oponentes jugado por el equipo numero: ");
            amount_oponents = Integer.parseInt(in.readLine());

            nombres_equipos[i] = names_teams;
            num_de_juegos[i] = amount_games;
            num_de_oponentes[i] = amount_oponents;

        }

        for (int i = 0; i < nombres_equipos.length; i++) {
            out.print(nombres_equipos[i] + " ");
        }
        out.println(" ");
        for (int i = 0; i < num_de_juegos.length; i++) {
            out.print(num_de_juegos[i] + " ");
        }

        resultados(nombres_equipos, num_de_juegos, teams);

    }

    public static void resultados(String[] equipos_nombre, int[] num_juegos, int teams) throws IOException {

        String nom_equip, nom_rival, snitch_equipo, snitch_rival, resultado_final = " ";
        int score_equipo, score_rival;
        int j = 0;
        String results[] = new String[teams];
        double total_points[] = new double[teams];

        for (int i = 0; i < teams; i++) {

            for (int k = 0; k < num_juegos[j]; k++) {

                nom_equip = equipos_nombre[j];

                out.print("\nJuego " + (k + 1) + " contra: ");
                nom_rival = in.readLine();

                out.print("Marcador de " + nom_equip + ": ");
                score_equipo = Integer.parseInt(in.readLine());

                out.print("Atrapó la snitch: ");
                snitch_equipo = in.readLine();

                if (snitch_equipo.equalsIgnoreCase("Si")) {

                    snitch_equipo = score_equipo + " * ";

                } else {

                    snitch_equipo = score_equipo + " ";

                }

                out.print("Marcador de " + nom_rival + ": ");
                score_rival = Integer.parseInt(in.readLine());

                out.print("Atrapó la snitch: ");
                snitch_rival = in.readLine();

                if (snitch_rival.equalsIgnoreCase("Si")) {

                    snitch_rival = score_rival + " * ";
                } else {

                    snitch_rival = score_rival + " ";

                }

                resultado_final = resultado_final + nom_equip + " vs " + nom_rival + ":" + " " + snitch_equipo + "- "
                        + snitch_rival
                        + "\n";

                results[i] = resultado_final;

            }

            j = j + 1;
        }

        for (int i = 0; i < results.length; i++) {
            out.print(results[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        registro_torneo(recibe_equipos());

    }

}
