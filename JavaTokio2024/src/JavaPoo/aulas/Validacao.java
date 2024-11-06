package JavaPoo.aulas;

import java.util.Scanner;

public class Validacao {

	public static void main(String[] args) {
		try (Scanner x = new Scanner(System.in)) {
			int tentativas = 0;
			boolean aux = false;

			while (aux == false) {
				String user = x.nextLine();
				System.out.println(user);

				String senha = x.nextLine();
				System.out.println(senha);

				if (user.equals("administrador") && senha.equals("123")) {
					aux = true;
					System.out.println("enguais");

				} else {
					tentativas++;
					System.out.println("Digite novamente!");
				}
					
			}

			System.out.println("Número de tentativas:" + tentativas);
		}

	}

}
