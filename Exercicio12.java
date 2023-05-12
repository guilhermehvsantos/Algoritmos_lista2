package lista2;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		double x, y, opcao;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Você pode escolher 3 operações para serem executadas!");
		System.out.println("Digite 1 para somar dois numeros.");
		System.out.println("Digite 2 para raiz quadrada desse numero");
		System.out.println("Digite 3 para elevar um numero a uma potencia");
		opcao = teclado.nextDouble();
		
		if (opcao == 1) { 
			System.out.println("Você digitou 1. Digite dois numeros para realizar a soma");
			x = teclado.nextDouble();
			y = teclado.nextDouble();
			double soma = x + y;
			System.out.println("O resultado é de " + soma);
		} else if (opcao == 2) {
			System.out.println("Você digitou 2. Digite um numero para descobrir sua raiz quadrada");
			x = teclado.nextInt();
			double raiz = Math.sqrt(x);
			System.out.println("O resultado é de " + raiz);
		} else if ( opcao == 3) {
			System.out.println("Você digitou 3. Digite um numero e a sua potencia");
			x = teclado.nextDouble();
			y = teclado.nextDouble();
			double potencia = Math.pow(x, y);
			System.out.println("O resutado é de " + potencia);
		} else {
			System.out.println("Você digitou uma opção invalida!");
		}

	}

}
