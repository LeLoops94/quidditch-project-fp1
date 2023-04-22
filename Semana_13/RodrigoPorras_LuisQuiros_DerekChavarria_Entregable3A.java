package Semana_13;

import java.io.*;

public class RodrigoPorras_LuisQuiros_DerekChavarria_Entregable3A {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        menu();
    }

    private static void menu() throws IOException {
        int opcion;
        int cantidadEquipos = 0;
        String[] equipos = null;
        String[] resultados = null;
        int[] numJuegos = null;
        int[] numOponentes = null;
        int[] puntajeTotal = null;

        do {
            out.println("\n\n------------------------------------");
            out.println("1. Iniciar Torneo");
            out.println("2. Registrar los equipos");
            out.println("3. Imprimir reporte de resultados de equipo");
            out.println("4. Imprimir puntaje total de cada uno de los equipos");
            out.println("5. Calcular el promedio de oponentes diferentes");
            out.println("6. Imprimir el nombre del equipo que ha jugado más partidos");
            out.println("7. Imprimir el nombre del equipo que con menor puntaje");
            out.println("8. Imprimir los nombres de los equipos que han jugado 5 partidos o más");
            out.println("9. mprimir el nombre de los equipos que tengan más oponentes que el promedio");
            out.println("10. Salir del juego");
            out.print("\nElija una opcion: ");
            opcion = Integer.parseInt(in.readLine());
            out.println("\n------------------------------------\n");

            switch (opcion) {
                case 1:
                    cantidadEquipos = recibeEquipos();
                    break;
                case 2:
                    if (cantidadEquipos != 0) {
                        equipos = definirEquipos(cantidadEquipos);
                        numJuegos = definirJuegos(cantidadEquipos);
                        numOponentes = definirOponentes(cantidadEquipos);
                        puntajeTotal = calcularPuntaje(numJuegos, numOponentes);
                        resultados = definirResultados(puntajeTotal, equipos);
                    }
                    break;
                case 3:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirResultados(equipos, numJuegos, numOponentes, resultados);
                    }
                    break;
                case 4:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirPuntajeTotal(equipos, puntajeTotal);
                    }
                    break;
                case 5:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirPromedioOponentes(cantidadEquipos, numOponentes);
                    }
                    break;
                case 6:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirEquipoMasJuegos(equipos, numJuegos);
                    }
                    break;
                case 7:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirEquipoMenorPuntaje(equipos, puntajeTotal);
                    }
                    break;
                case 8:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirEquipoMasJuegos(equipos, numJuegos);
                    }
                    break;
                case 9:
                    if (equipos != null && numJuegos != null && numOponentes != null) {
                        imprimirEquiposMasPromedioOponentes(cantidadEquipos, numOponentes, equipos, numOponentes);
                    }
                    break;
                case 10:
                    out.println("\n------------------------------------");
                    out.println("¡Hasta la proxima, Capitán!");
                    out.println("------------------------------------");
                    System.exit(0);
                    break;
                default:
                    out.println("\n------------------------");
                    out.println("Error: Opcion invalida");
                    out.println("------------------------");
                    break;
            }
        } while (opcion != 10);
    }

    private static void imprimirEquiposMasPromedioOponentes(int cantidadEquipos, int[] numOponentes, String[] equipos,
            int[] numOponentes2) {
    }

    private static void imprimirEquipoMenorPuntaje(String[] equipos, int[] puntajeTotal) {
    }

    private static void imprimirEquipoMasJuegos(String[] equipos, int[] numJuegos) {
    }

    private static void imprimirPromedioOponentes(int cantidadEquipos, int[] numOponentes) {
    }

    private static void imprimirPuntajeTotal(String[] equipos, int[] puntajeTotal) {
    }

    private static void imprimirResultados(String[] equipos, int[] numJuegos, int[] numOponentes, String[] resultados) {
    }

    private static int recibeEquipos() {
        return 0;
    }

    private static String[] definirResultados(int[] puntajeTotal, String[] equipos) {
        return null;
    }

    private static int[] calcularPuntaje(int[] numJuegos, int[] numOponentes) {
        return null;
    }

    private static int[] definirOponentes(int cantidadEquipos) {
        return null;
    }

    private static int[] definirJuegos(int cantidadEquipos) {
        return null;
    }

    private static String[] definirEquipos(int cantidadEquipos) {
        return null;
    }
}

