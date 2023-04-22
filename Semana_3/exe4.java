package Semana_3;

import java.io.*;

public class exe4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        String nacionalidad;

        out.print("Cual es su nacionalidad?");
        nacionalidad = in.readLine();

        if (nacionalidad.equals("costarricense") || nacionalidad.equals("Costarricense")) {
            out.print("si puede entrar al pais");
        } else {
            out.print("no puede entrar al pais");
        }

    }

}
