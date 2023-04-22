package Semana_2;

import java.io.*;

public class secondexe {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        // EJERCICIO#2

        // Variables

        float k_inicial, k_final, k_recorrido;

        // Entrada de datos

        out.println("Ingrese kilometrake inicial");
        k_inicial = Float.parseFloat(in.readLine());

        out.println("Ingrese kilometrake inicial");
        k_final = Float.parseFloat(in.readLine());

        // Proceso

        k_recorrido = k_final - k_inicial;

        // Salida

        out.println("Kilometrake recorrido" + k_recorrido);

    }

}
