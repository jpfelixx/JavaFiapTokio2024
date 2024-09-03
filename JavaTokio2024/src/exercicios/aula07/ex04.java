package exercicios.aula07;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		int m=0;
		 
		    for (int i = 0; i <10; i++) {
		    	 int n = scan.nextInt();

		    	 m+=n;
				
			}
		    System.out.println("A soma dos valores digitadpos é:"+m);

	}

}

