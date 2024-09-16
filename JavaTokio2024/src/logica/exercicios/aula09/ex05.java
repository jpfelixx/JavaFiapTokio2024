package logica.exercicios.aula09;

public class ex05 {

	public static void main(String[] args) {

		String[] months = { "Jan", "Fev", "Mar", "Abril", "Maio", "Junho", "Julho", "Agost", "Setem", "Outubro",
				"Novemb", "Dezembro" };
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < 12; i++) {
			System.out.println("O mês " + months[i] + " tem " + days[i] + " dias");
		}

	}

}
