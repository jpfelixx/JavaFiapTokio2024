package logica.exercicios.aula11;

public class ex03 {

	public static void main(String[] args) {
		System.out.println(calcular(10, 10, '/'));

	}

	public static double calcular(double a, double b, char d) {
		switch (d) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			System.out.println("Operador inválido!");
			return 0;
		}

	}

}
