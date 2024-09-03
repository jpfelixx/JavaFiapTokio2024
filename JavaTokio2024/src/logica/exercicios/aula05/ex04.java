package logica.exercicios.aula05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota");
		double nt1 = scan.nextDouble();

		System.out.println("Digite sua segunda nota");
		double nt2 = scan.nextDouble();
		double m = nt1+nt2/2;
		System.out.printf("Sua nota final é %.2f:", m);
		
		 scan.close();

	}

}
