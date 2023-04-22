package Semana_4;

import java.io.*;

public class tarea2_alt {
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

        int puntos_infracciones, vigencia;
        double monto_renovacion, servicio_BCR, monto_BCR;

        out.print("Por favor ingrese los puntos acumulados por infracciones: ");
        puntos_infracciones = Integer.parseInt(in.readLine());
        out.println("");

        if (puntos_infracciones <= 11) {

            out.println("Su licencia no está suspendida, puede renovar. Por ende:  ");
            out.println(" ");

            if (puntos_infracciones <= 4) {

                monto_renovacion = 5000;
                vigencia = 6;
                servicio_BCR = 4200;
                monto_BCR = monto_renovacion + servicio_BCR;

                out.println("El monto a pagar por la renovación es de " + monto_renovacion + " "
                        + "colones, con una vegencia de " + vigencia + " " + "años.");
                out.println("");

                out.println(
                        "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrará 4200 colones por el servicio, con un monto total de: "
                                + monto_BCR + " " + "colones.");
                out.println("");
            } else {

                if ((puntos_infracciones >= 5) && (puntos_infracciones <= 8)) {

                    monto_renovacion = 10000;
                    vigencia = 4;
                    servicio_BCR = 4200;
                    monto_BCR = monto_renovacion + servicio_BCR;

                    out.println("El monto a pagar por la renovación es de " + monto_renovacion + " "
                            + "colones, con una vigencia de " + vigencia + " " + "años.");
                    out.println("");

                    out.println(
                            "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrará 4200 colones por el servicio, con un monto total de: "
                                    + monto_BCR + " " + "colones.");
                    out.println("");
                } else {

                    if ((puntos_infracciones >= 9) && (puntos_infracciones <= 11)) {

                        monto_renovacion = 10000;
                        vigencia = 3;
                        servicio_BCR = 4200;
                        monto_BCR = monto_renovacion + servicio_BCR;

                        out.println("El monto a pagar por la renovación es de " + monto_renovacion + " "
                                + "colones, con una vigencia de " + vigencia + " " + "años.");
                        out.println("");

                        out.println(
                                "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrará 4200 colones por el servicio, con un monto total de: "
                                        + monto_BCR + " " + "colones.");
                        out.println("");

                    }

                }

            }

        } else {

            out.println("Su licencia esta suspendida, no puede renovar.");

        }

    }

}
