package lista2;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ano;

		System.out.println("Informe um Ano");
		ano = teclado.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
		} else if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto");
		}

	}

}
