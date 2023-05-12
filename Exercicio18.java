package lista2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		double n1, n2, n3, n4, media;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as 3 notas na sequência de 0 a 100");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
		n4 = teclado.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é " + media);

		System.out.println("Das 14 aulas que foram dadas quantas você assistiu?");

		int aulas = 14;
		int presenca;

		presenca = teclado.nextInt();

		presenca = (presenca / aulas) *100;

		System.out.printf("Você teve %.2f%% de presença", presenca);

		System.out.printf("Você teve %.2f%% de presença", presenca);
    	System.out.println("");

    		if ( media >= 80 && presenca == 100 ) {
			System.out.println("Você ganhou uma excursão");
		} else if ( media >= 80 || presenca == 100) {
			System.out.println("Você ganhou uma camiseta");
		} else if ( media >= 70 && media < 80 && presenca == 100) {
			System.out.println("Você ganhou um squeeze");
		} else if ( media >= 70 && media < 80 || presenca == 100) {
		System.out.println("Você ganhou uma caneta personalizada");
		} else {
			System.out.println("Você não ganhou premios!");
		}

	}
}
