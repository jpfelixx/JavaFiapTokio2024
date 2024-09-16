package logica.exercicios.aula11;

public class ex02 {

	public static void main(String[] args) {

		System.out.println(descobrirvoto(16));
	}

	public static String descobrirvoto(double idade) {

		if (idade < 16)
			return "Seu voto é proibido";
		else {
			if (idade >= 16 && idade < 18 || idade >= 70)
				return "Seu voto é opcional";
			else {
				return "Seu voto é obrigatório";
			}

		}
	}

}
