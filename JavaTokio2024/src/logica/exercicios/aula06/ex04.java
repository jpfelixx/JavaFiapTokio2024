package logica.exercicios.aula06;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int b = scan.nextInt();
		int a = scan.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("sao multiplos");
		} else
			System.out.println(" nao sao multiplos");

		scan.close();

	}

}
