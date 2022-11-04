package desafioDio;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		String movimentos = new Scanner(System.in).nextLine();

		int x = 0, y = 0;

		for (int i = 0; i < movimentos.length(); i++) {
			char ch = movimentos.charAt(i);
			if (ch == 'W') {
				// cima
				y = y + 1;
			}
			if (ch == 'A') {
				// esquerda
				x = x - 1;
			}
			if (ch == 'S') {
				// baixo
				y = y - 1;
			}
			if (ch == 'D') {
				x = x + 1;
			}
		}
		if (x == 0 && y == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
