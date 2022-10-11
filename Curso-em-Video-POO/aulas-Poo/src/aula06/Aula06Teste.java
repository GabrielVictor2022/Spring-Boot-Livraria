package aula06;

import java.util.Scanner;

public class Aula06Teste {

	public static void main(String[] args) {

		int choose;

		ControleRemotoTeste c = new ControleRemotoTeste();

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("1 - Ligar");
			System.out.println("2 - Desligar");
			System.out.println("3 - Abrir menu");
			System.out.println("4 - Fechar menu");
			System.out.println("5 - Aumentar volume");
			System.out.println("6 - Diminuir volume");
			System.out.println("7 - Ligar mudo");
			System.out.println("8 - Desligar mudo");
			System.out.println("9 - Play");
			System.out.println("10 - Pause");
			System.out.println("0 - Sair");
			System.out.print("Selecione a opção: ");
			choose = teclado.nextInt();

			switch (choose) {
			case 1:
				c.onTv();
				break;
			case 2:
				c.offTv();
				break;
			case 3:
				c.openMenu();
				break;
			case 4:
				c.closeMenu();
				break;
			case 5:
				c.moreVolume();
				break;
			case 6:
				c.lessVolume();
				break;
			case 7:
				c.mute();
				break;
			case 8:
				c.unMute();
				break;
			case 9:
				c.play();
				break;
			case 10:
				c.pause();
				break;
			case 0:
				System.out.println("Finishing...");
				break;

			default:
				System.out.println("Invalid option!");
				break;
			}
		} while (choose != 0);

	}
}
