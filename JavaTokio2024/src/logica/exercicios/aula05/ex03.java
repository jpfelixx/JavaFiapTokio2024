package logica.exercicios.aula05;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		System.out.println("Digite seu gênero");
		System.out.println("[m] para masculino \n[f] para feminino\n[o] para outro\n[n]nao esquecer\n");
		char a = scan.nextLine().charAt(0);
		System.out.printf("\n Olá, %s! Você escolheu a seguinte opção de gênero: %c", nome, a);

		scan.close();

	}

}
