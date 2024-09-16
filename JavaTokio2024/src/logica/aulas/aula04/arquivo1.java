package logica.aulas.aula04;

import java.util.Scanner;

public class arquivo1 {

	public static void main(String[] args) {
		System.out.println("Hello Carpenter!");

		int age;
		String name;

		Scanner x = new Scanner(System.in);
		System.out.println("Digite sua idade e nomeeeee");
		age = x.nextInt();
		name = x.nextLine();
		name = x.nextLine();

		System.out.printf("o tamanho da string é %s\n", name.length());

		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " x " + age + " = " + age * i);
		}

		x.close();

	}

}
