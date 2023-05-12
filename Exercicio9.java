package lista2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		double salario;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do seu salario");
		salario = teclado.nextDouble();
		double salarioFinal = 0;
		
		if (salario < 2000) {
			salarioFinal = salario*1.10;
			System.out.println("Sua bonificação é de 10% e seu salario ficou " + salarioFinal );
		} else if (salario > 2000 && salario < 3000) {
			salarioFinal = salario*1.08;
			System.out.println("Sua bonificação é de 8% e seu salario ficou " + salarioFinal);			
		} else {
			salarioFinal = salario*1.05;
			System.out.println("Sua bonificação é de 8% e seu salario ficou " + salarioFinal);	
		}
		double salarioAux = 0;
		
		if (salarioFinal <= 2500) {
			salarioAux = salarioFinal + 350;
			System.out.println("Você receberá " + salarioAux + " com o auxilio de R$350,00");
		} else {
			salarioAux = salarioFinal + 300;
			System.out.println("Você receberá " + salarioAux + " com o auxilio de R$300,00");
		}
	}

}
