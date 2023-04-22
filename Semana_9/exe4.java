package Semana_9;

import java.io.*;

public class exe4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static int numero_mayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else {
            if (num2 > num3) {
                return num2;
            }
            return num3;
        }
    }

    public static void entrada_datos() throws IOException {
        int n1, n2, n3;
        out.println("Ingrese el primer valor: ");
        n1 = Integer.parseInt(in.readLine());
        out.println("Ingrese el segundo valor: ");
        n2 = Integer.parseInt(in.readLine());
        out.println("Ingrese el tercer valor: ");
        n3 = Integer.parseInt(in.readLine());

        out.println("El mayor de los numeros es: " + numero_mayor(n1, n2, n3));
    }

    public static void main(String[] args) throws IOException {

        entrada_datos();

    }
}