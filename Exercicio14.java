package lista2;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valorSaque, nota100, nota50, nota20, nota10, nota5, nota2;

		System.out.println("Informe o valor do saque: ");
		valorSaque = teclado.nextInt();

		nota100 = valorSaque / 100;
		valorSaque = valorSaque % 100;

		nota50 = valorSaque / 50;
		valorSaque = valorSaque % 50;

		nota20 = valorSaque / 20;
		valorSaque = valorSaque % 20;

		nota10 = valorSaque / 10;
		valorSaque = valorSaque % 10;

		nota5 = valorSaque / 5;
		valorSaque = valorSaque % 5;

		nota2 = valorSaque / 2;

		if (valorSaque % 2 == 0) {
			if (nota100 > 0) {
				System.out.println("Notas de 100: " + nota100);
			}
			if (nota50 > 0) {
				System.out.println("Notas de 50: " + nota50);
			}
			if (nota20 > 0) {
				System.out.println("Notas de 20: " + nota20);
			}
			if (nota10 > 0) {
				System.out.println("Notas de 10: " + nota10);
			}
			if (nota5 > 0) {
				System.out.println("Notas de 5: " + nota5);
			}
			if (nota2 > 0) {
				System.out.println("Notas de 2: " + nota2);
			}
		} else {
			System.out.println("Digite um valor válido!");
		}
	}

}
