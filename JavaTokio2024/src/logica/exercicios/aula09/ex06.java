package logica.exercicios.aula09;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double soma = 0;
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextDouble();
			soma += array[i];

		}

		System.out.println("soma é:  " + soma);

		scan.close();

	}

}
