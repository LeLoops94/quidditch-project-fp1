package Semana_6;

import java.io.*;

public class exe8_final {
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

        double cantidad_hormigas;
        int meses_a_proyectar;
        int maximo_hormigas = 28000, oso_consumo = 7000;

        out.print("Introduzca la cantidad inicial de hormigas: ");
        cantidad_hormigas = Integer.parseInt(in.readLine());

        out.print("Introduzca la cantidad de meses a proyectar: ");
        meses_a_proyectar = Integer.parseInt(in.readLine());

        int meses_proyectados = 1;

        while (meses_proyectados <= meses_a_proyectar) {
            meses_proyectados++;

            if (cantidad_hormigas >= oso_consumo) {

                cantidad_hormigas = cantidad_hormigas - oso_consumo;
            } else {
                cantidad_hormigas = 0;
            }

            if (cantidad_hormigas > maximo_hormigas) {

                cantidad_hormigas = (cantidad_hormigas * 1.31);

            } else {
                cantidad_hormigas = cantidad_hormigas * 1.40;
            }
        }

        out.print("La cantidad de hormigas despues de " + meses_a_proyectar + " meses es de: "
                + cantidad_hormigas);

    }
}