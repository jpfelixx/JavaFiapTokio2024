package JavaPoo.aulas;

public class Vetores {

	public static void main(String[] args) {

		int [] x = new int [10];
		lerVetor(x);
		imprimirvetor(x);
		
		for (int i : x) {
			System.out.println(i);
			
		}
	}

	
	public static void lerVetor(int []x) {
		for (int i = 0; i < x.length; i++) {
			x [i] =2*i;
			
		}
		
	}
	public static void imprimirvetor(int []x) {
		for (int j = 0; j < x.length; j++) {
			System.out.println(x[j]+"\t");

		}
		
	}
}
