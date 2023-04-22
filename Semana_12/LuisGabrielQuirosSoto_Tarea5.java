package Semana_12;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class LuisGabrielQuirosSoto_Tarea5 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void Menu() throws IOException {
        int opcion;
        int[] barcos_player = null;
        int[] barcos_computer = null;

        do {

            out.println("\n\n------------------------------------");
            out.println("1. ¡Inicializar Batalla Naval!");
            out.println("2. Imprimir dónde están los barcos");
            out.println("3. ¡Jugar!");
            out.println("4. Salir del juego");

            out.print("\nElija una opcion: ");
            opcion = Integer.parseInt(in.readLine());
            out.println("\n------------------------------------\n");

            switch (opcion) {
                case 1:

                    barcos_player = inicializar_barcos_jugador();
                    barcos_computer = inicializar_barcos_computadora();

                    break;
                case 2:

                    if (barcos_computer != null && barcos_computer != null) {
                        imprimo_barcos(barcos_player, "jugador");
                        imprimo_barcos(barcos_computer, "computadora");
                    } else {
                        out.println(
                                "\n\nLa flota no sido sido desplegada!\nSeleccione la opcion 1 para desplegar la flota\n\n");
                    }
                    break;
                case 3:

                    jugar(barcos_player, barcos_computer);

                    break;
                case 4:

                    out.println("\n------------------------------------");
                    out.println("¡Hasta la proxima, Capitán!");
                    out.println("------------------------------------");
                    break;

                default:
                    out.println("\n------------------------");
                    out.println("Error: Opcion invalida");
                    out.println("------------------------");
            }

        } while (opcion != 4);
    }

    public static int[] inicializar_barcos_jugador() throws IOException {

        // cambiar solo varia
        int size = 20;
        int[] barcos_player = new int[size];
        Arrays.fill(barcos_player, 0);

        out.println("***Despliegue de la flota***\n");

        for (int i = 0; i < 5;) {

            out.print("En que posicion desea posicionar el barco " + (i + 1) + ": ");
            int posicion = Integer.parseInt(in.readLine());

            if (barcos_player[posicion - 1] != 0) {
                out.print("Error! Ya existe un barco en esa posicion\n");

            } else {

                barcos_player[posicion - 1] = i + 1;
                i++;
            }

        }

        return barcos_player;

    }

    public static int[] inicializar_barcos_computadora() throws IOException {

        // cambiar solo varia
        int size = 20;
        int[] barcos_computer = new int[size];
        Arrays.fill(barcos_computer, 0);

        for (int i = 0; i < 5;) {

            Random rand = new Random();
            int posicion = rand.nextInt((20 - 1) + 1) + 1;

            if (barcos_computer[posicion - 1] == 0) {
                barcos_computer[posicion - 1] = i + 1;
                i++;

            }
        }

        return barcos_computer;

    }

    public static void imprimo_barcos(int[] nums, String type) {
        out.println("\nPosicion barcos del " + type + ":");

        for (int i = 0; i < nums.length; i++) {
            out.print(nums[i] + " ");
        }
    }

    public static void jugar(int[] navios_jugador, int[] navios_computador) throws IOException {

        int posicion_disparo_jugador = 0;
        int posicion_disparo_computadora = 0;
        int cantidad_barcos_derribados_jugador = 0;
        int cantidad_barcos_derribados_computadora = 0;
        int suma_puntos_jugador = 0;
        int suma_puntos_computadora = 0;

        for (int i = 0; i < 10 && cantidad_barcos_derribados_jugador < 5
                && cantidad_barcos_derribados_computadora < 5;) {

            out.print("\n**SU TURNO!**\n");
            out.print("\nEn que posicion quiere hacer el disparo: ");
            posicion_disparo_jugador = Integer.parseInt(in.readLine());

            int result_jugador = hacer_disparo(navios_computador, posicion_disparo_jugador);

            if (result_jugador != -1) {

                out.print("\nDisparo acertado, navio hundido!\n");
                cantidad_barcos_derribados_computadora = cantidad_barcos_derribados_computadora + 1;
                suma_puntos_jugador = suma_puntos_jugador + result_jugador;

            } else {

                out.print("\nDisparo no acertado!\n");

            }

            out.print("\n**TURNO DEL ENEMIGO**\n");
            Random rand = new Random();
            posicion_disparo_computadora = rand.nextInt((20 - 1) + 1) + 1;

            out.print("\nEl enemigo ha disparado en posicion " + posicion_disparo_computadora + "\n");

            int result_computadora = hacer_disparo(navios_jugador, posicion_disparo_computadora);

            if (result_computadora != -1) {

                out.print("\nDisparo acertado, navio hundido!\n");
                cantidad_barcos_derribados_jugador = cantidad_barcos_derribados_jugador + 1;
                suma_puntos_computadora = suma_puntos_computadora + result_computadora;

            } else {

                out.print("\nDisparo no acertado!\n");

            }

            i++;

        }

        imprimir_ganador(cantidad_barcos_derribados_jugador, cantidad_barcos_derribados_computadora,
                suma_puntos_jugador, suma_puntos_computadora);

    }

    public static int hacer_disparo(int[] lista, int posicion) throws IOException {

        int resultado = 0;

        if (lista[posicion - 1] != 0) {

            resultado = lista[posicion - 1];

        } else {

            resultado = -1;
        }

        return resultado;

    }

    public static void imprimir_ganador(int cantidad_barcos_derribados_jugador,
            int cantidad_barcos_derribados_computadora, int suma_puntos_jugador, int suma_puntos_computadora) {

        out.println("\n---------------------------\n");

        if (cantidad_barcos_derribados_jugador < cantidad_barcos_derribados_computadora) {
            out.println("\nUsted es el ganador");

        } else {
            if (cantidad_barcos_derribados_computadora < cantidad_barcos_derribados_jugador) {
                out.println("\nLa computadora ha ganado");

            } else {
                if (suma_puntos_jugador > suma_puntos_computadora) {
                    out.println("\nUsted ha ganado");

                } else {
                    if (suma_puntos_computadora > suma_puntos_jugador) {
                        out.println("\nLa computadora ha ganado");

                    } else {
                        out.println("\nEs un empate");

                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Menu();

    }

}
