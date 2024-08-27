package logica.aulas.aula04;

import java.util.Scanner;

public class arquivo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int b  =0;
		System.out.println("Digite sua idade"+ (b = scan.nextInt()));
		System.out.println(b);
		scan.close();

	}

}

