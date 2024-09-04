package logica.exercicios.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		
		
		Calendar c = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);
		
	
		if(hora>=6 && hora<12)
		System.out.println("Bom dia"+ nome);
		
		else if(hora>=12 && hora <18)
		System.out.println("Bom tarde"+ nome);
		
		else
			System.out.println("Boa noite"+ nome);

			

		
	}

}
