package exercicios.aula05;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais");
		float real = scan.nextFloat();
		float dolar = (real/5.54f);
		float euro = (real/6.16f);
		float peso = (real/0.0058f);

		float libra = (real/7.3f);
		float lene = (real/0.038f);
		System.out.printf("O valor convertido para dolar é %.2f ,  euro é %.2f, peso é %.2f, libra é %.2f, lene é %.2f",dolar, euro,peso,libra,lene);

		 scan.close();


		
	}
}
