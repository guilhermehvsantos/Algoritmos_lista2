package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe 1 numero entre 1 e 30!");
		int num1;
		
		num1 = teclado.nextInt();

		
		if(31 > num1 && num1 > 0 ) { 
			System.out.println("O seu numero foi " + num1);
		} else {
			System.out.printf("O numero que você digitou é invalido");
		}
		}

}
