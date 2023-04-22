package Semana_6;

import java.io.*;

public class exe00 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int contador = 1, cantidad, promedio, acumuladora = 0, numero;

        out.print("Indique la cantidad de numeros que desea promediar: 5 ");
        cantidad = Integer.parseInt(in.readLine());

        while (contador <= cantidad) {
            out.print("Ingrese un numero entero: ");
            numero = Integer.parseInt(in.readLine());
            acumuladora = acumuladora + numero;

            contador = contador + 1;

        }

        promedio = acumuladora / cantidad;
        out.print("El promedio de los numeros es de: " + promedio);

    }
}
