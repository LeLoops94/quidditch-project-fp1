package Semana_6;

import java.io.*;

public class exe8_test {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        /*
         * En la isla del Edén vive una gran cantidad de hormigas que se reproducen a
         * una tasa del 40%
         * mensual; en la isla existe además un oso hormiguero que se come 7000 hormigas
         * al final de cada mes
         * (o todas las hormigas que haya si la población de hormigas en ese momento es
         * inferior a 7000).
         * Cuando la población de hormigas de la isla sobrepasa el máximo de 28000,
         * comienza a haber
         * problemas de alimentación lo que hace que se reduzca la tasa de crecimiento
         * al 31% mensual. El
         * muestreo de la población se hace mensualmente, al final de cada mes. Haga un
         * programa que reciba
         * como entrada el número de hormigas que hay en un momento dado en la isla y un
         * número entero X, y
         * calcule la población de hormigas después de esos X meses.
         */

        double cantidad_inicial_de_hormigas, cantidad_final_de_hormigas = 1;
        int meses_a_proyectar = 1;
        int maximo_hormigas = 28000, oso_consumo = 7000;

        out.print("Introduzca la cantidad inicial de hormigas: ");
        cantidad_inicial_de_hormigas = Integer.parseInt(in.readLine());

        out.print("Introduzca la cantidad de meses a proyectar: ");
        meses_a_proyectar = Integer.parseInt(in.readLine());

        out.print("La cantidad de hormigas despues de " + meses_a_proyectar + " meses es de: "
                + cantidad_final_de_hormigas);

        while (cantidad_inicial_de_hormigas > 0) {
            meses_a_proyectar++;

            if (cantidad_inicial_de_hormigas > maximo_hormigas) {

                cantidad_final_de_hormigas = (cantidad_inicial_de_hormigas * 1.31);

            } else {

                cantidad_final_de_hormigas = cantidad_inicial_de_hormigas * 1.40;

            }

            if (cantidad_final_de_hormigas - oso_consumo <= 0) {

                cantidad_final_de_hormigas = 0;

            } else {

                cantidad_final_de_hormigas = cantidad_final_de_hormigas - oso_consumo;

            }
        }
    }
}
