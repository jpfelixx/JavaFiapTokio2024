package br.fiap.fabricaVeiculos;

public class main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Toyota", "Corolla", "Prata", "2020", "2021", "123456789", "2.0", "Automático", "16", 0.0, "João Silva");

		Carro carro2 = new Carro("Honda", "Civic", "Preto", "2019", "2020", "987654321", "1.5", "Manual", "17", 0.0, "Maria Oliveira");

		Carro carro3 = new Carro("Ford", "Fiesta", "Vermelho", "2021", "2022", "456789123", "1.6", "Automático", "15", 0.0, "Carlos Souza");

		Carro carro4 = new Carro("Chevrolet", "Onix", "Branco", "2022", "2023", "321654987", "1.0", "Manual", "14", 0.0, "Ana Costa");
		
		carro1.ligar();
		carro1.acelerar(3,2,12);
		carro1.acelerar(3, 2,12);
		carro1.frear(17);
		System.out.println(carro1.getVelocidade());
		
		
	
		
		
 
	}

	
}
