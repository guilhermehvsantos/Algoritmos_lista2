package lista2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A, B, C;

		System.out.println("Informe 2 valores diferentes");
		A = teclado.nextInt();

		B = teclado.nextInt();

		System.out.println("Você digitou " + A + " e " + B);

		C = A;
		A = B;
		B = C;

		System.out.println(
				"Os valores foram trocaados e respectivamente o primeiro valor agora é de " + A + " e o segundo " + B);

	}

}
