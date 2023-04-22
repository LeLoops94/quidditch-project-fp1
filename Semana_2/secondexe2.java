package Semana_2;

import java.io.*;

public class secondexe2 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        // Variants

        int marriage_year, age_grandma;

        // Data Entry

        out.println("Type the year of marriage");
        marriage_year = Integer.parseInt(in.readLine());

        // Process

        age_grandma = (2023 - marriage_year) + (25 - 7);

        // Out data

        out.println("The age of Ana's grandma is: " + age_grandma);

    }

}
