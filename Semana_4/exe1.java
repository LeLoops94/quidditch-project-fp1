package Semana_4;

import java.io.*;

public class exe1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int numero_compras;
        double monto_total, descuento = 0;

        out.print("Ingrese el numero de compras hechas: ");
        numero_compras = Integer.parseInt(in.readLine());

        out.print("Ingrese el monto total: ");
        monto_total = Double.parseDouble(in.readLine());

        if (numero_compras >= 6 && monto_total >= 10000) {

            descuento = monto_total * 35 / 100;
        }

        monto_total = monto_total - descuento;

        out.print("El precio a pagar es de: " + monto_total);

    }

}
