package JavaPoo.aulas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		System.out.println("====== ex 1.0 ======");

		Scanner x = new Scanner(System.in);
		int soma = 0;
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("====== ex 2.0 ======");

		for (int i = 0; i <= 100; i++) {
			soma = soma + i;
		}
		System.out.println(soma);

		System.out.println("====== ex 3.0 ======");

		float a, b, c;
		a = x.nextFloat();
		b = x.nextFloat();
		c = x.nextFloat();

		if (a > b && a > c)
			System.out.println("A é o mais pesado");
		else if (b > a && b > c)
			System.out.println("B é o mais pesado");
		else
			System.out.println("C É o mais pesado");

		
		System.out.println("====== ex 4.0 ======");
		for (int i = 0; i <= 100; i++) {
			if (i >= 50 && i <= 75)
				continue;
			else
				System.out.println(i);

		}
		
		System.out.println("====== ex 5.0 ======");
		System.out.println("Digite o user");
		x.nextLine();

		String user = x.nextLine();
		System.out.println(user);

		String senha = x.nextLine();
		System.out.println(senha);

		if (user.equals("administrador") && senha.equals("123"))

			System.out.println("enguais");
		
		
		System.out.println("====== ex 6.0 ======");
		float f = x.nextFloat();
		x.nextLine();
		String cu = x.nextLine();
		if (f >= 500.00f && cu.equals("DESCONTO10"))
			System.out.println("O Valor da compra agora é:" + (f - f * 0.10));
 
		

		
		

		
	}
}
