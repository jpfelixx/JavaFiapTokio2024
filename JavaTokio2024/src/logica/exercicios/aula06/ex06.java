package logica.exercicios.aula06;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int ano = scan.nextInt();
		int idade = 2024 - ano;
		if (idade < 16)
			System.out.println("Seu voto é proibido");
		else {
			if (idade >= 16 && idade < 18 || idade >= 70)
				System.out.println("Seu voto é opcional");
			else {
				System.out.println("Seu voto é obrigatório");
			}
		}
		scan.close();
	}

}
