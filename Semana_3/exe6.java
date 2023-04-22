package Semana_3;

import java.io.*;

public class exe6 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        float salario, salario_neto, impuesto = 0;

        out.print("ingrese su salario: ");
        salario = Float.parseFloat(in.readLine());

        if (salario >= 1000000) {
            impuesto = (salario * 10) / 100;

        }

        salario_neto = salario - impuesto;
        out.print("su salario neto es: " + salario_neto);

    }

}
