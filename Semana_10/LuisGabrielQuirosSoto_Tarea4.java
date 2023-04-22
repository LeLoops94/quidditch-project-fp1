package Semana_10;

import java.io.*;

import javafx.scene.control.Menu;

public class LuisGabrielQuirosSoto_Tarea4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void menu() throws IOException {

        String choice = "empty";

        out.print(
                "Bienvenido al sistema de implementacion de eco-factura del CNFL\n\nA. Calcular el mes de mayor consumo\nB. Calcular la eco-factura del mes\nQ. Salir\n");

        out.print("\nPor favor, ingrese su opcion: ");
        choice = in.readLine();

        if (choice.equals("A")) {

            return mes_mayor_consumo();

        }

    }

    public static String mes_mayor_consumo(String choice_link) {

        String name_month;

    }

    public static void main(String[] args) throws IOException {

        menu();

    }

}
