package Semana_9;

import java.io.*;

public class exe00 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void entrada_de_datos() throws IOException {

        int num_1, num_2;
        out.print("Ingrese el primer numero");
        num_1 = Integer.parseInt(in.readLine());
        out.print("Ingrese el primer numero");
        num_2 = Integer.parseInt(in.readLine());
        sumatoria(num_1, num_2);

    }

    public static void sumatoria(int n_1, int n_2) {

        int suma;
        suma = n_1 + n_2;
        out.print("El resultado de la suma es de: " + suma);

    }

    public static void main(String[] args) throws IOException {

        entrada_de_datos();

    }
}