package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a operação desejada (+, -, *, /, %) - ");
		String opcaoOperador = teclado.next();
		System.out.print("Número 1 - ");
		double numero1 = teclado.nextDouble();
		System.out.print("Número 2 - ");
		double numero2 = teclado.nextDouble();
		
		switch (opcaoOperador) {
		case "+":
			
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		case "%":
			System.out.println(numero1 % numero2);
			break;

		default:
			System.out.println("ERRO: Opção inválida");
			break;
		}
		teclado.close();
		
		
		
		
	}

}
