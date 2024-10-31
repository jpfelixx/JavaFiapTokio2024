package br.com.fiap.banco.Produtos;

public class LCI implements Produto {

	@Override
	public double investir( double valor) {
		// TODO Auto-generated method stub
		return valor += valor * 0.009;
	}

}
