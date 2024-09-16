package logica.exercicios.aula08;

import java.util.Calendar;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.DAY_OF_WEEK) == 3)
			System.out.println("terca feira =)");
		else if (c.get(Calendar.DAY_OF_WEEK) == 4)
			System.out.println("Quarta feira =), hj tem feira");

	}

}
