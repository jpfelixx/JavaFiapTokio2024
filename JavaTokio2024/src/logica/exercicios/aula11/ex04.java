package logica.exercicios.aula11;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a temperatura: ");
		double temp = scan.nextDouble();
		scan.nextLine();
		System.out.println("Qual o valor: ");
		char op = scan.nextLine().charAt(0);
		System.out.println("Qual o valor que vc deseja retornar: ");
		char r = scan.nextLine().charAt(0);

		System.out.println("retorno: " + calcularTemp(temp, op, r));
		scan.close();
		// teste
	}

	public static double calcularTemp(double a, char d, char r) {
		double k = 0.0;
		double c = 0.0;
		double f = 0.0;

		if (d == 'C') {
			c = a;
			k = a + 273.15;
			f = ((a * 9 / 5) + 32);
		}

		if (d == 'K') {
			k = a;
			c = a - 273.15;
			f = (a - 273.15 * 9 / 5) + 32;
		}

		if (d == 'F') {
			f = a;
			k = ((a - 32) * 5 / 9) + 273.15;
			c = ((a - 32) * 5 / 9);
		}
		System.out.printf("Fahrenheit:%.1f\nKelvin:%.1f\nCelcius:%.1f\n", f, k, c);

		switch (r) {
		case 'F':
			return f;
		case 'K':
			return k;
		case 'C':
			return c;
		}

		return 0;

	}

}
