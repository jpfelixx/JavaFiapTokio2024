package logica.exercicios.aula07;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		 int soma = 0;
		 System.out.println("Digite um valor positivo");	
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 
		 
		if(n<0) {
			while(n<0) {
				 System.out.println("O valor digitado é negativo, digite novamente");
				  n = scan.nextInt();
			 }
		}
		 
		    for (int i = 1; i <=n; i++) {
		    	
		    	if(n%i==0)
		    		System.out.println(i);
			}
		    
	}

}
