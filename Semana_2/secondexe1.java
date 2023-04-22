package Semana_2;

import java.io.*;

public class secondexe1 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        // EJERCICIO#3

        // declaracion de variables
        int edadAna;
        int edadElena;

        // entrada de datos
        out.print("ingrese la edad de Elena: ");
        edadElena = Integer.parseInt(in.readLine());

        // proceso
        edadAna = (edadElena * 2) + 10;

        // salida
        out.print("La edad de Ana es " + edadAna);

    }

}
