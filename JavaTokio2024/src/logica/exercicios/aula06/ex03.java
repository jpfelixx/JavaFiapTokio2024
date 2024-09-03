package logica.exercicios.aula06;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		float media =0;
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Digite a"+(i+1)+"ª nota");
			media+=scan.nextDouble();
		}
		
		media = media/4;
		
		if(media>=7) {
			System.out.println("Aprovado!=)");
		}
		else {
			if(media>=5 && media<7)
				System.out.println("Em recuperação!");
			else
				System.out.println("Reprovado!");

				

		}

		
	    	scan.close();
		
	
	}
	
}
