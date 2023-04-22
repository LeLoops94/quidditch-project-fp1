package Semana_4;

import java.io.*;

public class LuisGabrielQuirosSoto_Tarea22 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        out.println("Bienvenido al sistema de renovacion de licencias del CONAVI");
        out.println("");
        out.println("Los requisitos para renovar la licencia son los siguientes: ");
        out.println("- Tener cedula al dia y en buen estado");
        out.println("- Tener el dictamen medico vigente para la renovacion");
        out.println("- Pagar todas las multas de transito pendientes ");
        out.println("- No haber llegado a los 12 puntos o mas por infracciones de transito ");
        out.println("");

        int puntos_infracciones;

        out.print("Por favor ingrese los puntos acumulados por infracciones: ");
        puntos_infracciones = Integer.parseInt(in.readLine());
        out.println("");

        if (puntos_infracciones <= 11) {

            out.println("Su licencia no esta suspendida, puede renovar");

        } else {

            out.println("Su licencia esta suspendida, no puede renovar");

        }

        if (puntos_infracciones <= 4) {

            out.println("Monto a pagar por la renovacion es de 5000 colones, su licencia tendra vigencia por 6 anos");
            out.println(
                    "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrara 4200 clones por el servicio, con un monto total de 9200 colones");

        } else {

            if ((puntos_infracciones >= 5) && (puntos_infracciones <= 8)) {

                out.println(
                        "Monto a pagar por la renovacion es de 10000 colones, su licencia tendra vigencia por 4 anos");
                out.println("");
                out.println(
                        "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrara 4200 clones por el servicio, con un monto total de 14200 colones");

            } else {

                if ((puntos_infracciones >= 9) && (puntos_infracciones <= 11)) {

                    out.println(
                            "Monto a pagar por la renovacion es de 10000 colones, su licencia tendra vigencia por 3 anos");
                    out.println("");
                    out.println(
                            "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrara 4200 clones por el servicio, con un monto total de 14200 colones");

                }

            }

        }

    }

}
