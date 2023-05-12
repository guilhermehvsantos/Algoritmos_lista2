package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		String nomeAluno;
		
		
		int p1, p2, p3, p4;		
		
		nomeAluno = teclado.nextLine();
		
		System.out.println("Digite suas 4 notas respectivamente de 0 a 100!");
		p1 = teclado.nextInt();
		p2 = teclado.nextInt();
		p3 = teclado.nextInt();
		p4 = teclado.nextInt();
		
		int media = (p1+ p2 + p3 + p4) / 4;
		
		
		if(media < 20 ) { 
			System.out.println(nomeAluno + ", sua média foi " + media + " e sua classificação foi péssima");
		} else if (40 > media && media > 20 ) {
			System.out.println(nomeAluno + ", sua média foi " + media + " e sua classificação foi ruim");
		} else if (60 > media && media > 40 ) {
			System.out.println(nomeAluno + ", sua média foi " + media + " e sua classificação foi regular");
		} else if (80 > media && media > 60 ) {
			System.out.println(nomeAluno + ", sua média foi " + media + " e sua classificação foi bom");
		} else {
			System.out.println(nomeAluno + ", sua média foi " + media + " e sua classificação foi ótimo");
		}

	}

}
