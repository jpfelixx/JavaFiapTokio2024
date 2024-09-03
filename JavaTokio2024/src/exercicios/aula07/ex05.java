package exercicios.aula07;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		  int i=0;
		  int v =0 ;
		  int maior = 0;
		  while(i<12){
			  v = scan.nextInt();
			  if(v>maior)
				  maior = v;
			  i++;
		  }
		  System.out.println("O maior valor é:"+ maior);

	}

}

