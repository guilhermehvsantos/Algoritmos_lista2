package lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe 3 numeros");
		int num1, num2, num3;		
		
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		if(num1 > num3 && num3 > num2 ) { 
			System.out.println("O numero " + num3 + " esta entre " + num1 + " e o numero " + num2);
		} else if (num2 > num3 && num3 > num1 ) {
			System.out.println("O numero " + num3 + " esta entre " + num2 + " e o numero " + num1);
		} else {
			System.out.printf("O numero " + num3 + " esta fora do intervalo dos numeros " + num1 + " e " + num2);
		}
		}

}
