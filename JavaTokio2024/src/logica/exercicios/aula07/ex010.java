package logica.exercicios.aula07;

import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int cont = 0;
		 for (int i = 2; i <= 2000; i++) {
			 
			 for (int d = 1 ;d <= 2000; d++) {
				 if(i%d==0)
					 cont++;	
				}
			 if(cont == 2)
				 System.out.println(i);
			      cont = 0;
			
		}

	}

}

