package logica.exercicios.aula10;

public class ex04 {

	public static void main(String[] args) {
		calcular(10, 10, '/');

	}

	public static void calcular(double a, double b, char d) {
		double resultado = 0;

		switch (d) {
		case '+':
			resultado = a + b;
			break;
		case '-':
			resultado = a - b;
			break;
		case '*':
			resultado = a * b;
			break;
		case '/':
			resultado = a / b;
			break;
		default:
			System.out.println("Operador inválido!");
		}

		System.out.println(resultado);

	}

}
