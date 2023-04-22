package Semana_6;

import java.io.*;

public class exe5_Alison {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        // Haga un programa que reciba como entrada la cantidad de exámenes realizados
        // por un estudiante en un curso, y debe calcular la nota del curso que se
        // obtiene del promedio de todos los exámenes. El programa deberá determinar
        // además, si el estudiante aprobó, debe ir a ampliación o reprobó el curso. Un
        // estudiante aprueba el curso si su nota es mayor o igual a 70, debe hacer
        // ampliación si su nota es inferior a 70 pero superior o igual a 60, o reprueba
        // el curso si la nota es menor que 60.

        int i = 1, promedio, cantExamenes, sumaNotasExamenes = 0, notas;

        out.println("ingrese la cantidad de examenes: ");
        cantExamenes = Integer.parseInt(in.readLine());

        while (i <= cantExamenes) {

            out.println("Ingrese las notas: ");
            notas = Integer.parseInt(in.readLine());

            sumaNotasExamenes = sumaNotasExamenes + notas;
            i = i + 1;
        }
        promedio = sumaNotasExamenes / cantExamenes;

        out.println("El promedio es: " + promedio);

        if (promedio >= 70) {
            out.println("El estudiante aprobo");
        } else {
            if (promedio < 60) {
                out.print("El estudiante reprobo");
            } else {
                out.print("Debe ir a ampliacion");
            }
        }

    }
}