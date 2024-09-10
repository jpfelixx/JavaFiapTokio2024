package logica.exercicios.aula09;

import java.util.Scanner; 

public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int n = scan.nextInt(); 
		int [] vetor = new int [n]; 
		for (int i=n-1;i>=0; i--) {
			System.out.println("Entre com um valor");
			vetor[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(vetor[i]);
		}
	}

}
