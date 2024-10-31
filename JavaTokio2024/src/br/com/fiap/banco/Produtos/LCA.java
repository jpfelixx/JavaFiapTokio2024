package br.com.fiap.banco.Produtos;

public class LCA implements Produto{

	@Override
	public double investir( double valor) {
		// TODO Auto-generated method stub
		return valor += valor * 0.008;
	}

}
