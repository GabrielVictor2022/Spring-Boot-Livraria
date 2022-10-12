package aula05;

import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {

		int escolha;

		ContaBanco cB = new ContaBanco(0, false);

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("----------------------------");
			System.out.println("1.Abrir conta");
			System.out.println("2.Fechar conta");
			System.out.println("3.Depositar");
			System.out.println("4.Sacar");
			System.out.println("5.Pagar mensalidade");
			System.out.println("6.Estado atual da conta");
			System.out.println("0.Sair\n");
			System.out.print("O que você deseja fazer?");
			escolha = teclado.nextInt();
			System.out.println("----------------------------");

			switch (escolha) {
			case 1:
				System.out.print("Qual tipo de conta você deseja?(cc - cp)");
				cB.abrirConta(teclado.next());

				System.out.print("Digite o número da conta: ");
				cB.setNumConta(teclado.nextInt());

				System.out.print("Digite o titular da conta: ");
				cB.setDono(teclado.next());
				break;
			case 2:
				System.out.print("Digite o número da conta: ");
				cB.setNumConta(teclado.nextInt());

				System.out.print("Digite o titular da conta: ");
				cB.setDono(teclado.next());
				cB.fecharConta();
				break;
			case 3:
				System.out.print("Digite o valor que você deseja depositar: ");
				cB.depositar(teclado.nextDouble());
				break;
			case 4:
				System.out.print("Digite o valor que você deseja sacar: ");
				cB.sacar(teclado.nextDouble());
				break;
			case 5:
				cB.pagarMensalidade();
				break;
			case 6:
				cB.estadoAtual();
				break;
			case 0:
				System.out.println("Obrigado e volte sempre!");
				break;
			default:
				System.out.println("ERRO! opção inválida");
				break;
			}
		} while (escolha != 0);

		teclado.close();

	}

}
