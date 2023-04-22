package Semana_6;

import java.io.*;

public class exe3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int N, i = 1, factorial = 1;
        out.println("Ingrese un valor para determinar el factorial: ");
        N = Integer.parseInt(in.readLine());

        while (i <= N) {
            factorial = factorial * i;
            i = i + 1;
        }

        out.println("El factorial de " + N + " es: " + factorial);
    }
}