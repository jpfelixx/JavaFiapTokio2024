package br.fiap.fabricaVeiculos;

public class Caminhao {

    private String marca;
    private String modelo;
    private String cor;
    private String anofabrica;
    private String anoModelo;
    private String renavam;
    private Motor motor;
    private String tipocambio;
    private String arosRodas;
    private double velocidade;
    private Carga carga;
    private int eixos;
    private Condutor condutor;
    private boolean ligado;

   

    public Caminhao(String marca, String modelo, String cor, String anofabrica, String anoModelo, String renavam,
			Motor motor, String tipocambio, String arosRodas, double velocidade, Carga carga, int eixos,
			Condutor condutor, boolean ligado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anofabrica = anofabrica;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.tipocambio = tipocambio;
		this.arosRodas = arosRodas;
		this.velocidade = velocidade;
		this.carga = carga;
		this.eixos = eixos;
		this.condutor = condutor;
		this.ligado = ligado;
	}

	public void ligar() {
        this.ligado = true;
        System.out.println("Caminhão ligado.");
    }

    public void desligar() {
        if (this.velocidade == 0) {
            this.ligado = false;
            System.out.println("Caminhão desligado.");
        } else {
            System.out.println("Desligamento não permitido enquanto o caminhão estiver em movimento.");
        }
    }

    public void acelerar(double ace, int tempo, int limite) {
        if (this.ligado) {
            if (ace <= limite) {
                this.velocidade += ace * tempo;
                System.out.println("Velocidade após aceleração: " + this.velocidade);
            } else {
                System.out.println("Aceleração passada é maior que o limite suportado.");
            }
        } else {
            System.out.println("O caminhão está desligado. Ligue-o antes de acelerar.");
        }
    }

    public void frear(double v) {
        if (this.velocidade > 0 && this.ligado) {
            System.out.println("Caminhão freando.");
            if (this.velocidade >= v) {
                this.velocidade -= v;
            } else {
                System.out.println("Impossível frear mais, caminhão parado.");
                this.velocidade = 0;
            }
            System.out.println("Velocidade após frenagem: " + this.velocidade);
        } else {
            System.out.println("O caminhão está parado ou desligado.");
        }
    }

    public void carregar(int qtd) {
        if (carga.getQntdcargasupoAbas() + qtd <= carga.getQntdcargasupo()) {
        	carga.setQntdcargasupoAbas(carga.getQntdcargasupoAbas()+qtd);
            System.out.println("Carga carregada. Carga total agora: " + carga.getQntdcargasupoAbas());
        } else {
            System.out.println("Carga não pode ser carregada. Capacidade excedida.");
        }
    }

    public void descarregar(int qtd) {
        if (carga.getQntdcargasupoAbas()  >= qtd) {
            carga.setQntdcargasupoAbas(carga.getQntdcargasupoAbas()-qtd); 
            System.out.println("Carga descarregada. Carga total agora: " + carga.getQntdcargasupoAbas());
        } else {
            System.out.println("Não há carga suficiente para descarregar.");
            carga.setQntdcargasupoAbas(0);
        }
    }
}
