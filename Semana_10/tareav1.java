package Semana_10;

import java.io.*;

import javax.management.openmbean.OpenMBeanConstructorInfo;

public class tareav1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        String choice = "empty";
        String calculation = "empty";

        out.print(
                "Bienvenido al sistema de implementacion de eco-factura del CNFL\n\nA. Calcular el mes de mayor consumo\nB. Calcular la eco-factura del mes\nQ. Salir\n");

        out.print("\nPor favor, ingrese su opcion: ");
        choice = in.readLine();

        switch (choice) {

            case "A":

                out.print("Process A");

                break;

            case "B":

                out.print("Process B");

                break;

            case "C":

                out.print("Process C");

                break;

        }

    }
}
