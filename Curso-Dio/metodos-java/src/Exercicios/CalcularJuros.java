package Exercicios;

import java.util.Scanner;

public class CalcularJuros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o valor - ");
		double valor = teclado.nextDouble();

		System.out.print("Digite a quantidade de parcelas (1 á 5) - ");
		int parcelas = teclado.nextInt();

		if (parcelas <= 2) {
			System.out.println("Sem juros");
		} else if (parcelas == 3) {
			System.out.println("1% de juros");
			valor = valor + valor/100;
			System.out.println(valor);
		} else if (parcelas == 4) {
			System.out.println("2% de juros");
			valor = valor + (valor/100 * 2);
			System.out.println(valor);
		}else {
			System.out.println("3% de juros");
			valor = valor + (valor/100 * 3);
			System.out.println(valor);
		}
		
		teclado.close();

	}

}
