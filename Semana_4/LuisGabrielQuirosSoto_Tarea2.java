package Semana_4;

import java.io.*;

public class LuisGabrielQuirosSoto_Tarea2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        out.println("");
        out.println("Bienvenido al sistema de renovación de licencias del CONAVI");
        out.println("");
        out.println("Los requisitos para renovar la licencia son los siguientes: ");
        out.println("- Tener cédula al día y en buen estado");
        out.println("- Tener el dictamen medico vigente para la renovación");
        out.println("- Pagar todas las multas de transito pendientes ");
        out.println("- No haber llegado a los 12 puntos o más por infracciones de tránsito ");
        out.println("");

        int puntos_infracciones;
        String monto_y_vigencia, recargo_BCR, renovacion, suspension;

        out.print("Por favor ingrese los puntos acumulados por infracciones: ");
        puntos_infracciones = Integer.parseInt(in.readLine());
        out.println("");

        if (puntos_infracciones <= 11) {

            renovacion = "Su licencia no está suspendida, puede renovar. Por ende: ";

            out.println(renovacion);
            out.println("");

            if (puntos_infracciones <= 4) {

                monto_y_vigencia = "El monto a pagar por la renovación es de 5000 colones, su licencia tendrá vigencia por 6 años";
                recargo_BCR = "Si usted desea renovar en el Banco de Costa Rica, el banco le cobrará 4200 colones por el servicio, con un monto total de 9200 colones";

                out.println(monto_y_vigencia);
                out.println("");
                out.println(recargo_BCR);
                out.println("");

            } else {

                if ((puntos_infracciones >= 5) && (puntos_infracciones <= 8)) {

                    monto_y_vigencia = "El monto a pagar por la renovación es de 10000 colones, su licencia tendrá vigencia por 4 años";
                    recargo_BCR = "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrará 4200 colones por el servicio, con un monto total de 14200 colones";

                    out.println(monto_y_vigencia);
                    out.println("");
                    out.println(recargo_BCR);
                    out.println("");

                } else {

                    if ((puntos_infracciones >= 9) && (puntos_infracciones <= 11)) {

                        monto_y_vigencia = "El monto a pagar por la renovacion es de 10000 colones, su licencia tendrá vigencia por 3 años";
                        recargo_BCR = "Si usted desear renovar en el Banco de Costa Rica, el banco le cobrará 4200 colones por el servicio, con un monto total de 14200 colones";

                        out.println(monto_y_vigencia);
                        out.println("");
                        out.println(recargo_BCR);
                        out.println("");

                    }

                }

            }

        } else {

            suspension = "Su licencia esta suspendida, no puede renovar";

            out.println(suspension);

        }

    }

}
