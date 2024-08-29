package exercicios.aula06;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int codigoestado,codigocarga;
		float pesocarga,precocarga = 0;
		float imposto;
		
		System.out.println("Digite o código de estado");
		codigoestado = scan.nextInt();
		
		System.out.println("Digite o peso da carga em toneladas");
		pesocarga = scan.nextFloat();
		

		System.out.println("Digite o  código da carga");
		codigocarga = scan.nextInt();
		
		pesocarga = pesocarga*1000;
		System.out.println("O valor em kg é: "+pesocarga);
		
		if(codigocarga >=10 && codigocarga<=20)
		{
			precocarga =  pesocarga*100;
			System.out.println("preço da carga é:"+precocarga);
		}
			
		else if(codigocarga >=21 && codigocarga<=30)
		{
			precocarga =  pesocarga*250;
			System.out.println("preço da carga é:"+precocarga);

		}
		else if(codigocarga >=31 && codigocarga<=40) {
			precocarga =  pesocarga*340;
			System.out.println("preço da carga é:"+precocarga);

		}
			
		else
			System.out.println("código inválido");
		
		if(codigoestado == 1) 
			imposto = 0.35f;
		else if(codigoestado == 2) 
			imposto = 0.25f;
		else if(codigoestado == 3) 
			imposto = 0.15f;	
		else if(codigoestado == 4) 
			imposto = 0.05f;
		else
			imposto = 0.0f;
		
		System.out.printf("o valor do imposto é: %.1f \n", precocarga*imposto);
		precocarga = precocarga+imposto*precocarga;
		System.out.println("o valor total é:"+precocarga );
		scan.close();

	
		
	}
}
