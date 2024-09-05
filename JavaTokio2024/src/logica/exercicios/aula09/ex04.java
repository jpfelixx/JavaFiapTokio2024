package logica.exercicios.aula09;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		double media = 0;
		int acima = 0, abaixo = 0 ;
		double  []  array = new double[n]; 
		for (int i = 0; i < array.length; i++) {
			
			array[i]= scan.nextDouble();	
			media+= array[i];
			
		}
		media = media/n;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]>media)
				acima++;
			else
				abaixo++;
			
			
		}
		
	System.out.println("Média "+media);
	System.out.println("abaixo "+abaixo);
	System.out.println("acima "+acima);

		
		scan.close();
		
	}

}
