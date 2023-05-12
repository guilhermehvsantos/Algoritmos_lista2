package lista2;

import java.util.Scanner;

public class Exercicios6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu sexo, M ou F");
		
		String genero;
		genero = teclado.nextLine();
		
		System.out.println("Agora informe sua altura em centimetros!");
		double altura;		
		
		altura = teclado.nextDouble();
		
		double peso = (52 + (0.67 * (altura - 152.4)));
		
		if(genero.equalsIgnoreCase("F") ) { 
			peso = (52 + (0.67 * (altura - 152.4)));
			System.out.println("Você é do sexo " + genero + " e deve pesar " + peso);
		} else if (genero.equalsIgnoreCase("M")) {
			peso = (52 + (0.75 * (altura - 152.4)));
			System.out.println("Você é do sexo " + genero + " e deve pesar " + peso);
		} else {
			System.out.println("Você provavelmente digitou um valor invalido");
		}
		}

}
