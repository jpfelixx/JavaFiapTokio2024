package logica.exercicios.aula11.exercicio05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o 1º valor: ");
		double a = scan.nextDouble();
		scan.nextLine();
		System.out.println("Entre com o operador: ");
		char op = scan.nextLine().charAt(0);
		System.out.println("Entre com o 2º valor: ");
		double b = scan.nextDouble();

		System.out.printf("O resultado é: %.3f", operacoesmatematicas.calcular(a, op, b));
		scan.close();

	}

}
