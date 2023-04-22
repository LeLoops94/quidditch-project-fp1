package Semana_10;

import java.io.*;

public class tarea_final_1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void Menu() throws IOException {
        String opcion;
        // Mostrar menu
        do {
            out.println("A. Calcular el mes con mas consumo");
            out.println("B. Calcular la eco-factura del mes");
            out.println("Q. Salir");

            opcion = in.readLine();
            switch (opcion) {
                case "A":
                    // Calcular mes con mas consumo
                    MesMayorConsumo();
                    break;
                case "B":
                    // Calcular eco-factura del mes
                    imprimirEcoFactura("Marzo", 200.0, 300.0, 400.0);
                    break;
                case "Q":
                    // Salir del programa
                    out.println("Saliendo del programa...");
                    break;
                default:
                    // Opcion invalida
                    out.println("Opcion invalida");

            }
        } while (!(opcion.equals("Q")));
    }

    public static void MesMayorConsumo() throws IOException {
        double consumo;

        double mayorConsumo = 0;
        String mesMayorConsumo = "", mes;

        for (int i = 0; i < 6; i++) {
            out.print("Ingrese el nombre del mes " + (i + 1) + ": ");
            mes = in.readLine();

            out.print("Ingrese el total de KWH consumidos en el mes de " + mes + ": ");
            consumo = Double.parseDouble(in.readLine());

            if (consumo > mayorConsumo) {
                mayorConsumo = consumo;
                mesMayorConsumo = mes;
            }
        }
        out.println("El mes con mayor consumo fue " + mesMayorConsumo);
    }

    public static double montoEnergia(double consumoPunta, double consumoValle, double consumoNocturno) {
        double monto = 0;

        if (consumoPunta <= 500) {
            monto += consumoPunta * 167.72;
        } else {
            monto += 500 * 167.72 + (consumoPunta - 500) * 207.39;
        }

        if (consumoValle <= 500) {
            monto += consumoValle * 68.75;
        } else {
            monto += 500 * 68.75 + (consumoValle - 500) * 83.71;
        }

        if (consumoNocturno <= 500) {
            monto += consumoNocturno * 28.77;
        } else {
            monto += 500 * 28.77 + (consumoNocturno - 500) * 38.74;
        }

        return monto;
    }

    public static double montoAlumbradoPublico(double totalKwh) {
        double monto = totalKwh * 3.37;
        return monto;
    }

    public static double montoTributoBomberos(double totalKwh) {
        double monto = totalKwh * 0.0175;
        return monto;
    }

    public static double montoIVA(double consumoTotal, double montoEnergia) {
        if (consumoTotal >= 280) {
            return montoEnergia * 0.13;
        } else {
            return 0;
        }
    }

    public static void imprimirEcoFactura(String mes, double kwhPunta, double kwhValle, double kwhNoct) {
        double montoEnergiaTotal = montoEnergia(kwhPunta, kwhValle, kwhNoct);
        double montoAlumbradoPublico = montoAlumbradoPublico(kwhPunta + kwhValle + kwhNoct);
        double montoTributoBomberos = montoTributoBomberos(kwhPunta + kwhValle + kwhNoct);
        double montoFacturado = montoEnergiaTotal + montoAlumbradoPublico + montoTributoBomberos;
        double montoIVA = montoIVA(kwhPunta + kwhValle + kwhNoct, montoFacturado);
        double totalAPagar = montoFacturado + montoIVA;

        out.println("Factura para el mes de " + mes);
        out.println("Consumo total en el mes: " + (kwhPunta + kwhValle + kwhNoct) + " KWH");
        out.println("Monto correspondiente a Energía: " + montoEnergiaTotal + " colones");
        out.println("Monto correspondiente a alumbrado público: " + montoAlumbradoPublico + " colones");
        out.println("Monto correspondiente al tributo a bomberos: " + montoTributoBomberos + " colones");
        out.println("Monto correspondiente al IVA: " + montoIVA + " colones");
        out.println("Total a pagar en la factura: " + totalAPagar + " colones");
    }

    public static void main(String[] args) throws IOException {

        Menu();

    }

}