package Semana_11;

import java.io.*;

public class exe1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static int[] llenoArreglo() throws IOException {
        int[] ventas = new int[12];
        for (int i = 0; i < 12; i++) {
            out.print("Ingrese las ventas del mes: ");
            ventas[i] = Integer.parseInt(in.readLine());
        }
        return ventas;
    }

    public static void imprimoArreglo(int[] nums) {
        out.println("Arreglo de numeros");
        for (int i = 0; i < 12; i++) {
            out.print(nums[i] + " ");
        }
    }

    public static int sumoArreglo(int[] nums) {
        int suma = 0, promedio;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        promedio = suma / 12;
        return promedio;
    }

    public static void mayor(int[] nums, int promedio) {
        int venta_mayores = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > promedio) {
                venta_mayores++;
            }
        }
        out.print("Cant meses mayores a promedio: " + venta_mayores);
    }

    public static void main(String[] args) throws IOException {
        int[] numeros = llenoArreglo();
        imprimoArreglo(numeros);
        int promedio = sumoArreglo(numeros);
        out.print("Promedio: " + promedio);
        mayor(numeros, promedio);
    }

}
