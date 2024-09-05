package logica.exercicios.aula08;

import java.util.Random;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int par = 0,primo = 0 , impar=0,cont =0;
		Random r = new Random();
		
		//teste
				
		for (int i = 0; i <7 ; i++) {
			int a = r.nextInt(1,10);
			System.out.println(a);
			if(a%2==0)
				par++;
			else
				impar++;
			for (int j = 1; j <=a; j++) {
				
				if(a%j==0)
					cont++;
			}
			
		    if(cont==2)	
		    	primo++;
		    cont = 0;
		}
		 System.out.println("primos: "+primo);
		 System.out.println("par: "+par);
		 System.out.println("impar: "+impar);


		
	}

}
