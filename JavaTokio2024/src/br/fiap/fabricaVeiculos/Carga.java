package br.fiap.fabricaVeiculos;

public class Carga {

	  private double qntdcargasupo;
	  private double qntdcargasupoAbas;
	  private String tipoCarga;
	public Carga(double qntdcargasupo, double qntdcargasupoAbas, String tipoCarga) {
		super();
		this.qntdcargasupo = qntdcargasupo;
		this.qntdcargasupoAbas = qntdcargasupoAbas;
		this.tipoCarga = tipoCarga;
	}
	public double getQntdcargasupo() {
		return qntdcargasupo;
	}
	public void setQntdcargasupo(double qntdcargasupo) {
		this.qntdcargasupo = qntdcargasupo;
	}
	public double getQntdcargasupoAbas() {
		return qntdcargasupoAbas;
	}
	public void setQntdcargasupoAbas(double qntdcargasupoAbas) {
		this.qntdcargasupoAbas = qntdcargasupoAbas;
	}
	public String getTipoCarga() {
		return tipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	  
	  
	  
}
