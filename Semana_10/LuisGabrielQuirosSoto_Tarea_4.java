package Semana_10;

import java.io.*;

public class LuisGabrielQuirosSoto_Tarea_4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void Menu() throws IOException {

        String opcion;

        do {

            out.println("\n--------------------------------------------------------------------");
            out.println("Bienvenido al sistema de implementacion de eco-facturas del CNFL");
            out.println("--------------------------------------------------------------------\n");

            out.println("\nA. Calcular el mes con mas consumo");
            out.println("B. Calcular la eco-factura del mes");
            out.println("Q. Salir");

            out.print("\nDe las tres letras arriba indicadas en el menu, por favor ingrese su opcion: ");
            opcion = in.readLine();

            switch (opcion) {
                case "A":

                    mes_mayor_consumo();
                    break;
                case "B":

                    imprimir_eco_factora(null, 0, 0, 0);
                    break;
                case "Q":

                    out.println("\n-----------------------------------");
                    out.println("Saliendo del sistema");
                    out.println("------------------------------------\n");
                    out.println("Muchas gracias, que tenga un buen dia!");
                    break;

                default:
                    out.println("Opcion invalida");

            }
        } while ((opcion.equals("Q")));

    }

    public static void mes_mayor_consumo() throws IOException {

        double consumo, consumo_mayor = 0;
        String mes_de_mayor_consumo = "empty", mes_a_ingresar;

        out.println("-----------------------------------");
        out.println("Calculo del mes con mas consumo");
        out.println("------------------------------------\n");

        for (int i = 0; i < 6; i++) {

            out.print("Ingrese el nombre del mes " + (i + 1) + ": ");
            mes_a_ingresar = in.readLine();

            out.print("Ingrese la cantidad de KWH consumidos en el mes de " + mes_a_ingresar + ": ");
            consumo = Double.parseDouble(in.readLine());

            if (consumo > consumo_mayor) {

                consumo_mayor = consumo;
                mes_de_mayor_consumo = mes_a_ingresar;

            }
        }
        out.print("\nEl mes con mayor cosumo fue " + mes_de_mayor_consumo + "\n");
    }

    public static double monto_energia(double total_consumo_punta, double total_consumo_valle,
            double total_consumo_nocturno) {

        double costo_total = 0, costo_horario_punta = 0, costo_horario_valle = 0, costo_horario_nocturno = 0;

        if (total_consumo_punta <= 500) {

            costo_horario_punta += total_consumo_punta * 167.72;

        } else if (total_consumo_punta > 500) {

            costo_horario_punta += total_consumo_punta * 207.39;
        }

        if (total_consumo_valle <= 500) {

            costo_horario_valle += total_consumo_valle * 68.75;

        } else if (total_consumo_valle > 500) {

            costo_horario_valle += total_consumo_valle * 83.71;
        }

        if (total_consumo_nocturno <= 500) {

            costo_horario_nocturno += total_consumo_nocturno * 28.77;

        } else if (total_consumo_nocturno > 500) {

            costo_horario_nocturno += total_consumo_nocturno * 38.74;
        }

        costo_total = costo_horario_punta + costo_horario_valle + costo_horario_nocturno;

        return costo_total;
    }

    public static double monto_alumbrado_publico(double total_KWH_en_mes) {

        double costo = total_KWH_en_mes * 3.37;

        return costo;

    }

    public static double monto_tributo_bomberos(double total_KWH_en_mes) {

        double costo = total_KWH_en_mes * 0.0175;

        return costo;

    }

    public static double monto_IVA(double total_KWH_en_mes, double monto_total_KWH_del_mes) {

        if (total_KWH_en_mes >= 280) {

            return monto_total_KWH_del_mes * 0.13;

        } else {

            return monto_total_KWH_del_mes;
        }

    }

    public static void imprimir_eco_factora(String mes, double consumo_total_punta, double consumo_total_valle,
            double consumo_total_nocturno) throws IOException {

        double monto_total_KWH_del_mes, total_KWH_en_mes = 0, monto_total_alumbrado_publico,
                monto_total_tributo_bomberos, monto_energia_IVA, total_eco_factura;

        out.println("-----------------------------------");
        out.println("Calculo de de la eco-factura");
        out.println("------------------------------------\n");

        out.print("Ingrese el mes del cual desea una eco-factura: ");
        mes = in.readLine();

        out.print("Ingrese los KWH consumidos en horario Punta: ");
        consumo_total_punta = Double.parseDouble(in.readLine());

        out.print("Ingrese los KWH consumidos en horario Valle: ");
        consumo_total_valle = Double.parseDouble(in.readLine());

        out.print("Ingrese los KWH consumidos en horario Nocturno: ");
        consumo_total_nocturno = Integer.parseInt(in.readLine());

        monto_total_KWH_del_mes = monto_energia(consumo_total_punta, consumo_total_valle, consumo_total_nocturno);
        monto_total_alumbrado_publico = monto_alumbrado_publico(
                total_KWH_en_mes = consumo_total_punta + consumo_total_valle + consumo_total_nocturno);
        monto_total_tributo_bomberos = monto_tributo_bomberos(
                total_KWH_en_mes = consumo_total_punta + consumo_total_valle + consumo_total_nocturno);
        monto_energia_IVA = monto_IVA(total_KWH_en_mes, monto_total_KWH_del_mes);
        total_eco_factura = monto_total_KWH_del_mes + monto_total_alumbrado_publico + monto_total_tributo_bomberos
                + monto_energia_IVA;

        out.println("\n-----------------------------------");
        out.println("Eco-factura para el mes de " + mes);
        out.println("------------------------------------\n");

        out.println("- Costo total de energia consumida en el mes es de " + monto_total_KWH_del_mes + " colones");
        out.println("- Consumo total de KWH en el mes es de " + total_KWH_en_mes + " KWH");
        out.println("- Costo total de alumbrado publico en el mes es de " + monto_total_alumbrado_publico + " colones");
        out.println(
                "- Costo total del tributo a bomberos en el mes es de " + monto_total_tributo_bomberos + " colones");
        out.println("- El costo del IVA es: " + monto_energia_IVA);
        out.println(
                "\n***El monto total de la eco-factura para el mes es de: " + total_eco_factura + " colones***");

    }

    public static void main(String[] args) throws IOException {

        Menu();

    }

}