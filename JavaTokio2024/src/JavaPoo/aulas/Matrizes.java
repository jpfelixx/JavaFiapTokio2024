package JavaPoo.aulas;

import java.util.Random;

public class Matrizes {
	

	public static void main(String[] args) {
   
		int [][] mt = new int [3][5];
		lerVetor(mt);
		imprimirvetor(mt);
		
		System.out.println("\nForeach na Matriz\n");
		for (int[] linha : mt) {
			for (int n : linha) {
				System.out.print(n+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void lerVetor(int[] []mt) {
		 Random r = new Random();
		for (int i = 0; i < mt.length; i++) {

			for (int j = 0; j <  mt[0].length; j++) {
			
				mt[i][j] = r.nextInt(10,30);
			}
		}
		
	}
	public static void imprimirvetor(int [][]mt) {
		for (int i = 0; i < mt.length; i++) {
			
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print( mt[i][j]+" " );
			}
			 System.out.println();
		}
	}
}

