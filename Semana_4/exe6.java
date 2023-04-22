package Semana_4;

import java.io.*;

public class exe6 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int lado_a, lado_b, lado_c;

        out.println("Digite la medida del lado A: ");
        lado_a = Integer.parseInt(in.readLine());
        out.println("Digite la medida del lado B: ");
        lado_b = Integer.parseInt(in.readLine());
        out.println("Digite la medida del lado C: ");
        lado_c = Integer.parseInt(in.readLine());

        if ((lado_a + lado_b) > lado_c) {
            if ((lado_b + lado_c) > lado_a) {
                if ((lado_c + lado_a) > lado_b) {
                    out.println("Las medidas dadas corresponden a un triangulo.");
                } else {
                    out.println("Las medidas dadas No corresponden a un triangulo.");
                }
            } else {
                out.println("Las medidas dadas No corresponden a un triangulo.");
            }
        } else {
            out.println("Las medidas dadas No corresponden a un triangulo.");
        }

    }

}
