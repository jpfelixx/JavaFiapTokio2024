package logica.exercicios.aula11.exercicio05;

public class operacoesmatematicas {

	public static double calcular(double a, char op, double b) {
		switch (op) {
		case '+':
			return soma(a, b);
		case '-':
			return sub(a, b);
		case '*':
			return mult(a, b);
		case '/':
			return div(a, b);
		default:
			System.out.println("Operador inválido!");
			return 0;
		}

	}

	private static double soma(double a, double b) {
		double resultado = a + b;

		return resultado;
	}

	private static double sub(double a, double b) {
		double resultado = a - b;

		return resultado;
	}

	private static double div(double a, double b) {
		double resultado = a / b;

		return resultado;
	}

	private static double mult(double a, double b) {
		double resultado = a * b;

		return resultado;
	}

}
