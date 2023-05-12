package lista2;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		int horaIni, horaTer, minIni, minTer;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o horario que começa e que termina (de 0 a 24)");
		horaIni = teclado.nextInt();
		horaTer = teclado.nextInt();
		
		System.out.println("Digite o minuto que começou e o minuto que terminou (de 0 a 60)");
		minIni = teclado.nextInt();
		minTer = teclado.nextInt();
		
		int duracaoHora, minJogo = 0;
		
		if ( horaIni > horaTer ) {
			duracaoHora = horaIni - horaTer + 12;
		} else {
			duracaoHora = horaTer - horaIni;
		}
		
		if ( minIni >= minTer ) {
			minJogo = minIni - minTer;
			System.out.println("O jogo começou as " + horaIni +" horas e " + minIni + " minutos");
			System.out.println("Terminou as " + horaTer +" horas e " + minTer + " minutos");
			System.out.println("E durou " + duracaoHora +" horas e " + minJogo + " minutos");
			
		} else {
			minJogo = minTer - minIni;
			duracaoHora = duracaoHora -1;
			System.out.println("O jogo começou " + horaIni +" horas e " + minIni + " minutos");
			System.out.println("Terminou as " + horaTer +" horas e " + minTer + " minutos");
			System.out.println("E durou " + duracaoHora +" horas e " + minJogo + " minutos");
		}
		

	}

}
