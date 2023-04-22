package Semana_9;

import java.io.*;

public class exe1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    static double hipotenusa(double lado1, double lado2) {
        double hip;
        hip = Math.sqrt((Math.pow(lado1, 2)) + (Math.pow(lado2, 2)));
        return hip;
    }

    static void entradaDatos() throws IOException {
        int l1, l2;
        out.print("Ingrese la medida del primer lado: ");
        l1 = Integer.parseInt(in.readLine());
        out.print("Ingrese la medida del segundo lado: ");
        l2 = Integer.parseInt(in.readLine());
        out.println("La medida de la hipotenusa es: " + hipotenusa(l1, l2));
    }

    public static void main(String[] args) throws IOException {

    }
}