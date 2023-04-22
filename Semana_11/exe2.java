package Semana_11;

import java.io.*;

public class exe2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static int[] reporte_notas() throws IOException {

        // cambiar solo varia
        int size;
        out.print("Ingrese la cantidad de notas a almacenar");
        size = Integer.parseInt(in.readLine());
        int[] notas = new int[size];

        for (int i = 0; i < notas.length; i++) {
            out.print("Ingrese el valor a almacenar: ");
            notas[i] = Integer.parseInt(in.readLine());
        }

        return notas;

    }

    public static void imprimo_notas(int[] notas) {
        out.println("Arreglo de numeros");
        for (int i = 0; i < notas.length; i++) {
            out.print(notas[i] + " ");
        }
    }

    public static int nota_mayor(int[] notas) {
        int mayor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mayor) {

                mayor = notas[i];
            }
        }
        return mayor;
    }

    public static int nota_menor(int[] notas) {
        int menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) {

                menor = notas[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) throws IOException {

    }

}
