package logica.exercicios.aula08;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String word = scan.nextLine();

		int ctmaius = 0, ctminus = 0, ctnum = 0, vazio = 0;

		for (int i = 0; i < word.length(); i++) {

			if ((word.charAt(i) >= 'A') && (word.charAt(i) <= 'Z')) {
				ctmaius++;
			} else if ((word.charAt(i) >= 'a') && (word.charAt(i) <= 'z')) {
				ctminus++;
			} else if ((word.charAt(i) >= '0') && (word.charAt(i) <= '9')) {
				ctnum++;
			} else if (word.charAt(i) == ' ') {
				vazio++;
			}

		}
		System.out.println("max " + ctmaius);
		System.out.println("numb " + ctnum);
		System.out.println("void " + vazio);
		System.out.println("minus " + ctminus);
	}

}
