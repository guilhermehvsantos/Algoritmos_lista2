package lista2;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		double n1, n2, n3, media, recuperacao;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as 3 notas na sequência de 0 a 100");
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();

		media = (n1 + n2 + n3) / 3;

		System.out.println("Sua média é " + media);

		if (media >= 6) {
			System.out.println("Você está aprovado");
		} else if (media >= 5 && media < 6) {
			System.out.println("Você está de recuperação!");
			System.out.println("Qual foi a nota da recuperação");
			recuperacao = teclado.nextDouble();

			media = (recuperacao + media) / 2;

			if (media >= 6) {
				System.out.println("Você está aprovado por recuperação!");
			} else {
				System.out.println("Você está reprovado mesmo com a recuperação!");
			}
		} else {
			System.out.println("Você está reprovado!");

		}

	}

}
