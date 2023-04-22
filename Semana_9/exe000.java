package Semana_9;

import java.io.*;

public class exe000 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void entrada_de_datos() throws IOException {

        int num_1, num_2, resultado;
        out.print("Ingrese el primer numero");
        num_1 = Integer.parseInt(in.readLine());
        out.print("Ingrese el primer numero");
        num_2 = Integer.parseInt(in.readLine());
        resultado = sumatoria(num_1, num_2);

    }

    public static int sumatoria(int n_1, int n_2) {

        int suma;
        suma = n_1 + n_2;
        return suma;

    }

    public static void main(String[] args) throws IOException {

        entrada_de_datos();

    }
}