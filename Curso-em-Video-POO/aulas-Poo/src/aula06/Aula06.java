package aula06;

import java.util.Scanner;

public class Aula06 {

	public static void main(String[] args) {
		
		int escolha;
		
		ControleRemoto c = new ControleRemoto();
		
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("\n");
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
			escolha = teclado.nextInt();
			
			switch (escolha) {
			case 1:
				c.ligar();
				break;
			case 2:
				c.desligar();
				break;
			case 3:
				c.abrirMenu();
				break;
			case 4:
				c.fecharMenu();
				break;
			case 5:
				c.maisVolume();
				break;
			case 6:
				c.menosVolume();
				break;
			case 7:
				c.ligarMudo();
				break;
			case 8:
				c.desligarMudo();
				break;
			case 9:
				c.play();
				break;
			case 10:
				c.pause();
				break;
			case 0:
				System.out.println("Finalizando...");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (escolha != 0);
		
	}

}
