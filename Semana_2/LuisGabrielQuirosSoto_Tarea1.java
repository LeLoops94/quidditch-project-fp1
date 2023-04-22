package Semana_2;

import java.io.*;

public class LuisGabrielQuirosSoto_Tarea1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        // Variables

        Double salario_mensual, salario_pendiente, monto_liquidacion, vacaciones_no_gozadas, aguinaldo_proporcional,
                preaviso, cesantia;

        // Entrada de datos

        out.println("Ingrese su salario mensual");
        salario_mensual = Double.parseDouble(in.readLine());

        // Proceso

        salario_pendiente = salario_mensual;
        vacaciones_no_gozadas = (salario_mensual / 30) * 14;
        aguinaldo_proporcional = salario_mensual / 12;
        preaviso = salario_mensual;
        cesantia = ((salario_mensual / 30) * 20) * 2;
        monto_liquidacion = salario_pendiente + vacaciones_no_gozadas + aguinaldo_proporcional + preaviso + cesantia;

        // Salida

        out.println("El monto de liquidacion por terminacion es: " + monto_liquidacion);

    }
}