package lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double peso, altura;
		System.out.println("Qual é seu peso em kilos e sua altura em centimetros");
		peso = teclado.nextDouble();
		altura = teclado.nextDouble();
		
		double imc = peso / ((altura * altura)) * 10000;
		
		System.out.println("Seu imc é de " + imc);
		
		if (imc <= 16 ) { 
			System.out.println("Você tem magreza severa ");
		} else if ( imc > 16 && imc < 17 ) {
			System.out.println("Você tem magreza moderada");
		}else if ( imc >= 17 && imc < 18.5 ) {
			System.out.println("Você tem magreza leve");
		}else if ( imc >= 18.5 && imc < 25 ) {
			System.out.println("Você está normal");
		}else if ( imc >= 25 && imc < 30 ) {
			System.out.println("Você tem obesidade leve");
		}else if ( imc >= 30 && imc < 40 ) {
			System.out.println("Você tem obesidade severa");
		}else  {
			System.out.println("Você tem obesidade mórbida");
		}
	}
}
