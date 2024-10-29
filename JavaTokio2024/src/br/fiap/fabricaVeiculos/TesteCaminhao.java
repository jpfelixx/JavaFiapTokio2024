package br.fiap.fabricaVeiculos;

public class TesteCaminhao {

    public static void main(String[] args) {
        // Criando um objeto Caminhao
        Caminhao caminhao = new Caminhao("Mercedes", "Actros", "Preto", "2020", "2021", 
                                           "123456789", "OM 457 LA", "Automático", 
                                           "22", 0.0, 10000.0, 0.0, "Carga Geral", 
                                           3, "João", false);

        // Ligando o caminhão
        caminhao.ligar();

        // Acelerando o caminhão
        caminhao.acelerar(10, 2, 100); // Acelera 10 por 2 segundos
        caminhao.frear(5); // Freando 5

        // Carregando carga
        caminhao.carregar(5000);
        caminhao.carregar(6000); // Tentando carregar acima da capacidade

        // Descarregando carga
        caminhao.descarregar(3000);
        caminhao.descarregar(8000); // Tentando descarregar mais do que o disponível

        // Desligando o caminhão
        caminhao.desligar();
    }
}
