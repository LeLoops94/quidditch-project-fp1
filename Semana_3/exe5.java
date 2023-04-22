package Semana_3;

import java.io.*;

public class exe5 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int consumo_mensual;

        out.print("Ingrese su consumo mensual ");
        consumo_mensual = Integer.parseInt(in.readLine());

        if (consumo_mensual > 200) {

            out.println("Usted debe de pagar impuesto");

        }

    }

}
