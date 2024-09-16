package logica.exercicios.aula06;

import java.util.Scanner;

public record ex09() {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("\n tipo cliente     |    valor do KWH ");
		System.out.printf("\n residência   1   |    0.60 ");
		System.out.printf("\n comércio     2   |    0.48 ");
		System.out.printf("\n indústria    3   |    1.30 \n");
		float kmh = scan.nextFloat();
		int opc = scan.nextInt();

		if (opc == 1)
			System.out.println("O valor da conta final é" + kmh * 0.60);
		else if (opc == 2)
			System.out.println("O valor da conta final é" + kmh * 0.48);
		else
			System.out.println("O valor da conta final é" + kmh * 1.4);

	}

}
