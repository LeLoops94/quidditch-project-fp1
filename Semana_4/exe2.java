package Semana_4;

import java.io.*;

public class exe2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int fecha_pelicula, mayoria_edad, promocion, rating;

        out.print("Digite 1 si la fecha de la funcion es despues del 15 del mes, de lo contrario ingrese 0 ");
        fecha_pelicula = Integer.parseInt(in.readLine());

        out.print("Digite 1 si la pelicula no es para mayores de edad, de lo contrario ingrese 0 ");
        mayoria_edad = Integer.parseInt(in.readLine());

        out.print("Digite 1 si hay promocion, de lo contrario ingrese 0 ");
        promocion = Integer.parseInt(in.readLine());

        out.print("Digite 1 si el rating de la pelicula es mayor a cuatro, de lo contrario ingrese 0 ");
        rating = Integer.parseInt(in.readLine());

        if ((fecha_pelicula == 1 || promocion == 1) && (rating == 1 || mayoria_edad == 1)) {
            out.print("Usted puede ir a ver la pelicula");
        } else {
            out.print("Usted no puede ir al cine ");
        }
    }
}
