package Semana_10;

import java.io.*;

public class exepiedrapapeltijera {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        String player_1, player_2, choice_first_player, choice_second_player, outcome = "";
        int amount_of_games = 5;

        out.print("Jugador 1, ingrese su nombre: ");
        player_1 = in.readLine();

        out.print("Jugador 2, ingrese su nombre: ");
        player_2 = in.readLine();

        out.print("Mano de jugador 1: ");
        choice_first_player = in.readLine();

        out.print("Mano de jugador 2: ");
        choice_second_player = in.readLine();

        for (int i = 1; i < amount_of_games; i++) {

            out.println("---------------------------------");
            out.println("Game time!");
            out.println("---------------------------------");

            if (choice_first_player.equals("Piedra") && choice_second_player.equals("Piedra")) {

                out.print("Es un empate!\n");

            }

            if (choice_first_player.equals("Papel") && choice_second_player.equals("Papel")) {

                out.print("Es un empate!");

            }

            if (choice_first_player.equals("Tijera") && choice_second_player.equals("Tijera")) {

                out.print("Es un empate!");

            }

            if (choice_first_player.equals("Piedra") && choice_second_player.equals("Tijera")) {

                out.print(player_1 + "es el ganador!");

            }

            if (choice_first_player.equals("Tijera") && choice_second_player.equals("Papel")) {

                out.print(player_1 + "es el ganador!");

            }

            if (choice_first_player.equals("Papel") && choice_second_player.equals("Piedra")) {

                out.print(player_1 + "es el ganador!");

            }

            if (choice_first_player.equals("Tijera") && choice_second_player.equals("Piedra")) {

                out.print(player_2 + "es el ganador!");

            }

            if (choice_first_player.equals("Papel") && choice_second_player.equals("Tijera")) {

                out.print(player_2 + "es el ganador!");

            }

            if (choice_first_player.equals("Piedra") && choice_second_player.equals("Papel")) {

                out.print(player_2 + "es el ganador!");

            }

        }

    }
}