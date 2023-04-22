package Semana_5;

import java.io.*;

public class ExeSalarios {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int codigo_puesto, cantidad_horas_extra;
        final int maximo_horas_extra = 30;
        float salario_final, salario_base, tasa_horas_extra;

        out.println("----------------------------------------");
        out.println("SISTEMA PARA EL CALCULO DE SALARIO MENSUAL");
        out.println("----------------------------------------");
        out.println("Desgloce de los puestos en el departamento de ingeniería:");
        out.println(
                "1. Ingeniero Civil \n2. Ingeniero de Software \n3. Ingeniero Eléctrico \n4. Ingeniero Industrial \n\nPor favor, ingrese el numero de su puesto: ");
        codigo_puesto = Integer.parseInt(in.readLine());

        if (codigo_puesto >= 1 && codigo_puesto <= 4) {

            switch (codigo_puesto) {

                case 1:

                    salario_base = 750000;
                    tasa_horas_extra = 6250;

                    break;
                case 2:

                    salario_base = 1300000;
                    tasa_horas_extra = 10800;

                    break;

                case 3:

                    salario_base = 675000;
                    tasa_horas_extra = 5625;

                    break;

                case 4:

                    salario_base = 1150000;
                    tasa_horas_extra = 0;

                    break;

                case 5:

                    salario_base = 0;
                    tasa_horas_extra = 0;

                    break;

            }

            if (cantidad_horas_extra > 0) {

            }

        } else {

            out.println("Los datos ingresados no son validos");

        }

    }

}
