package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe 3 numeros");
		int num1, num2, num3;		
		
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		if(num1 > num2 && num3 > num2 ) { 
			System.out.printf("O numero n2(%d) é o menor", num2);
		} else if (num2 > num1 && num3 > num2 ) {
			System.out.printf("O numero n1(%d) é o menor", num1);
		} else {
			System.out.printf("Os numeros n3(%d) é o menor", num3);
		}
		}
	
}
