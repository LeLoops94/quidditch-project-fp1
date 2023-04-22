package Semana_9;

import java.io.*;

public class exe3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void entrada_datos() throws IOException {

        int cantidad_de_annios;
        double cantidad_dinero_presente, dinero_futuro, tasa_de_interes;

        out.println("Ingrese el monto de dinero presente: ");
        cantidad_dinero_presente = Double.parseDouble(in.readLine());

        out.println("Ingrese el monto de tasa de interes: ");
        tasa_de_interes = Double.parseDouble(in.readLine());

        out.println("Ingrese el numero de años a proyectar: ");
        cantidad_de_annios = Integer.parseInt(in.readLine());

        dinero_futuro = valor_future(cantidad_de_annios, tasa_de_interes, cantidad_dinero_presente);

        out.println("La cantidad de dinero a futuro es: " + dinero_futuro);

    }

    public static double valor_future(int n, double i, double p) {

        double dinero_a_futuro;
        dinero_a_futuro = p * Math.pow((1 + (i / 100)), n);
        return dinero_a_futuro;

    }

    public static void main(String[] args) throws IOException {

        entrada_datos();

    }
}