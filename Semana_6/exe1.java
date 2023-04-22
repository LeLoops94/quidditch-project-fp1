package Semana_6;

import java.io.*;

public class exe1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int N, i = 1;

        out.print("Ingrese un numero mayor a 1: ");
        N = Integer.parseInt(in.readLine());

        out.println("Los numeros pares entre 1 y " + N + " son: ");

        while (i <= N) {

            if (i % 2 == 0) {

                out.println(i);

            }

            i += 1;

        }

    }
}
