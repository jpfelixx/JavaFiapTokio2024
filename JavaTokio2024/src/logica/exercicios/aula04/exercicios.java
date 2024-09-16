package logica.exercicios.aula04;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// ex1
		int n;
		n = 21;
		System.out.println(n);
		// ex2
		System.out.println("Digite seu nome");
		System.out.println(scan.nextLine());

		// ex3
		System.out.println("Digite seu nome");
		System.out.println("Olá " + scan.nextLine());

		// ex4
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		scan.nextLine();

		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		System.out.printf("\n Olá %s. você tem %d anos \n", nome, idade);

		// ex5
		System.out.println("Digite seu salário");
		double wage = scan.nextDouble();
		System.out.println(wage);

		// ex6
		System.out.println("Digite seu nome");
		System.out.println("Oieee " + scan.nextLine());
	}

}
