package Semana_7;

import java.io.*;

public class exe1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int num = 2;

        while (num % 2 == 0) {
            out.print("Por favor escriba un número entero: ");
            num = Integer.parseInt(in.readLine());
        }
        out.print("Muchas Gracias.");

    }
}