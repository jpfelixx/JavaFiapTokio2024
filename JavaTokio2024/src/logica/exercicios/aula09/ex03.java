package logica.exercicios.aula09;

import java.util.Random;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Random r = new Random();
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {

			array[i] = r.nextInt(1, 100);

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		scan.close();

	}

}
