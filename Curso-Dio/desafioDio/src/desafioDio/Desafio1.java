package desafioDio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(new Scanner(System.in).nextLine());
		var step = 0;

		while (numero != 0) {

			if (numero % 2 == 0) { // par

				numero = numero / 2;

				++step;

			} else { // ímpar

				numero = numero - 1;

				++step;

			}
		}

		System.out.println(step);
	}
}
