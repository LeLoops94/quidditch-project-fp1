package Semana_9;

import java.io.*;

public class exe2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void converetirPies(double metros) {
        double pies;
        pies = metros * 39.3701;
        out.println("La distancia de pies a metros es: " + pies);
    }

    public static void converetirPulgadas(double metros) {
        double pulgadas;
        pulgadas = metros * 3.28084;
        out.println("La distancia de pulgadas a metros es: " + pulgadas);
    }

    public static void entradaDatos() throws IOException {
        double metros;
        out.print("ingrese los metros: ");
        metros = Double.parseDouble(in.readLine());
        converetirPies(metros);
        converetirPulgadas(metros);
    }

    public static void main(String[] args) throws IOException {

        entradaDatos();

    }

}