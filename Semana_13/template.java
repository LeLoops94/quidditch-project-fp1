package Semana_13;

import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class template {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Random r = new Random();

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

            out.print("Ingrese el nombre del equipo" + (i + 1) + " :");
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

    }

    public static void main(String[] args) throws IOException {

        registro_torneo(recibe_equipos());

    }

}
