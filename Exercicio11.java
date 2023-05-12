package lista2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		int x, y, z;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os 3 lados de um triangulo!");
		x = teclado.nextInt();
		y = teclado.nextInt();
		z = teclado.nextInt();
		
		if ( z <= x + y && y <= x + z && x <= z + y) {
			System.out.println("Você digitou valores válido e seu triangulo é "); 
			if ( z == y && x == z ) {
				System.out.println("Seu triangulo é equilatero");
			} else if ( z == y || x == z) {
				System.out.println("Seu triangulo é Isosceles"); 
			} else {
				System.out.println("Seu triangulo é escaleno");
			}
		} else {
			System.out.println("Esse valores são invalidos para os lados de um triangulo");
		}
		
		
		
		

	}

}
