package Semana_11;

import java.io.*;

public class template_arreglos {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static int[] lleno_arreglo() throws IOException {

        // cambiar solo varia
        int size = 0;
        int[] numeros = new int[size];

        for (int i = 0; i < numeros.length; i++) {
            out.print("Ingrese el valor a almacenar: ");
            numeros[i] = Integer.parseInt(in.readLine());
        }

        return numeros;

    }

    // Impresion de arreglos
    public static void imprimo_arreglo(int[] nums) {
        out.println("Arreglo de numeros");
        for (int i = 0; i < nums.length; i++) {
            out.print(nums[i] + " ");
        }
    }

    // Suma

    public static int sumoArreglo(int[] nums) {
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        return suma;
    }

    // Promedio

    public static int sumoArregloPromedio(int[] nums) {
        int suma = 0, promedio;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        promedio = suma / 12;
        return promedio;
    }

    public static void main(String[] args) throws IOException {

        int[] numeros = lleno_arreglo();
        imprimo_arreglo(numeros);
        out.println("\nLa suma de los numeros es: " + sumoArreglo(numeros));

    }

}
