/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) {
		String cantidad_barcos_derribados_computadora;
		String cantidad_barcos_derribados_jugador;
		String suma_puntos_computadora;
		String suma_puntos_jugador;

		if (cantidad_barcos_derribados_jugador < cantidad_barcos_derribados_computadora) {
			System.out.println("Usted es el ganador");
		} else {
			if (cantidad_barcos_derribados_computadora < cantidad_barcos_derribados_jugador) {
				System.out.println("La computadora ha ganado");
			} else {
				if (suma_puntos_jugador > suma_puntos_computadora) {
					System.out.println("Usted ha ganado");
				} else {
					if (suma_puntos_computadora > suma_puntos_jugador) {
						System.out.println("La computadora ha ganado");
					} else {
						System.out.println("Es un empate");
					}
				}
			}
		}
	}

}
