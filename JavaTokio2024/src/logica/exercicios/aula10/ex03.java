package logica.exercicios.aula10;

public class ex03 {

	public static void main(String[] args) {
    
		descobrirvoto(12);
	}
	

	public static void descobrirvoto(double idade ) {

      if(idade<16)
	 System.out.println("Seu voto é proibido");
else {
	if(idade>=16 && idade<18|| idade>=70)
		System.out.println("Seu voto é opcional");
	else {
		System.out.println("Seu voto é obrigatório");
	}
	
	}
	}
	

}

