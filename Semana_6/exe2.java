package Semana_6;

import java.io.*;

public class exe2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int N;

        out.println("Ingrese un numero que irá en cuenta regresiva: ");
        N = Integer.parseInt(in.readLine());

        out.println("Los números desde " + N + " hasta 1, son:");
        while (N >= 1) {
            out.println(N);
            N = N - 1;
        }

    }

}