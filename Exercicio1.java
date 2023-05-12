package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe dois numeros");
		int num1, num2;		
		
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if(num1 > num2 ) { 
			System.out.printf("O numero n1(%d) é o maior", num1);
		} else if (num2 > num1) {
			System.out.printf("O numero n2(%d) é o maior", num2);
		} else {
			System.out.printf("Os numeros n1(%d) e n2(%d) são iguais", num1, num2);
		}
		}
	
}
