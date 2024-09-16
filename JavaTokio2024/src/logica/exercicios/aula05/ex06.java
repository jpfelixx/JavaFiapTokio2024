package logica.exercicios.aula05;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome da peça 1");
		String nome1 = scan.nextLine();
		System.out.println("Digite o numero de peças");
		int nmrpeca1 = scan.nextInt();
		System.out.println("Digite o valor da peça ");
		double valor1 = scan.nextDouble();
		scan.nextLine();
		System.out.println("Digite o nome da peça 2");
		String nome2 = scan.nextLine();
		System.out.println("Digite o numero de peças 2");
		int nmrpeca2 = scan.nextInt();
		System.out.println("Digite o valor da peça 2");
		double valor2 = scan.nextDouble();

		double valorfinal = ((nmrpeca1 * valor1) + (nmrpeca2 * valor2));
		System.out.println(valorfinal);

		scan.close();
	}

}
