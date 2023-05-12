package lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		double n1, n2, n3, media;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as 3 notas na sequência de 0 a 100");
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();

		media = (n1 * 4 + n2 * 2 + n3 * 2) / 8;

		System.out.println("A média ponderada é " + media);

		if (media >= 50) {
			System.out.println("Você está aprovado");
		} else if (media >= 45 && media < 50) {
			System.out.println("Você está de recuperação!");

		} else {
			System.out.println("Você está reprovado!");

		}

	}

}
