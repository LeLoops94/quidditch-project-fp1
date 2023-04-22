package Semana_6;

import java.io.*;

public class exe4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int n;
        int i = 1;

        out.print("Ingrese un número mayor a 1: ");
        n = Integer.parseInt(in.readLine());

        out.println("Los multiplos de " + n + ", entre 1 y " + n + " son: ");

        while (i <= n) {
            if (n % i == 0) {
                out.println(i);
            }
            i = i + 1;
        }
    }
}