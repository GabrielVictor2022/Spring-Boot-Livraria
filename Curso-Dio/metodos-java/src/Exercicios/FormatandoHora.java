package Exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatandoHora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the time (HH) - ");
		int time = sc.nextInt();

		if (time < 12 && time >= 5) {
			System.out.println("Good morning!");
		} else if (time >= 12 && time < 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good night!");
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dtf.format(LocalDateTime.now()));
		
		sc.close();
	}

}
