package lista2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double salarioBase, gratificacao;
		System.out.println("Qual é seu salario e sua gratificação ");
		salarioBase = teclado.nextDouble();
		gratificacao = teclado.nextDouble();
		
		double bruto = (salarioBase * ((gratificacao/100) + 1));
		
		double imposto10 = 0.90;
		double imposto15 = 0.85;
		
		double salarioLiquido = bruto;
		System.out.println("Seu salario bruto é de " + bruto);
		if ( bruto > 2500 ) {
			System.out.println("Você pagará 15% de imposto e ficará com " + (salarioLiquido * imposto15));
		}	else {
			System.out.println("Você pagará 10% de imposto e ficará com " + (salarioLiquido * imposto10));
	}

	}

}
