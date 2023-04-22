package Semana_3;

import java.io.*;

public class exe1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int temperatura;

        out.print("ingrese la temperatura: ");
        temperatura = Integer.parseInt(in.readLine());

        if (temperatura > 37) {

            out.print("Tiene fiebre");
        }

    }

}
