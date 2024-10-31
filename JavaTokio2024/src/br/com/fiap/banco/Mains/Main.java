package br.com.fiap.banco.Mains;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.ContaCorrente;
import br.com.fiap.banco.Produtos.CDB;
import br.com.fiap.banco.Produtos.LCA;
import br.com.fiap.banco.Produtos.LCI;

public class Main {
    public static void main(String[] args) {
        // Cria um cliente
        Cliente cliente = new Cliente("João Silva", "12345678900");
        
        CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();
		//Produto p = new LCI();

        // Cria uma conta corrente com saldo inicial e saldo de investimento
        ContaCorrente contaCorrente = new ContaCorrente(cliente, "CC-12345", 5000.0);

        // Exibe os saldos iniciais
        contaCorrente.exibirSaldo();

        // Tenta investir em um tipo válido
        contaCorrente.investir(cdb, 500000.0);
        contaCorrente.exibirSaldo();

        // Tenta investir em um tipo inválido
        contaCorrente.investir(lca, 100.0);
        contaCorrente.exibirSaldo();

        // Tenta investir mais do que o saldo disponível
        contaCorrente.investir(lci, 900.0);
        contaCorrente.exibirSaldo();

        // Investe em LCA
        contaCorrente.investir(lca, 50.0);
        contaCorrente.exibirSaldo();
    }
}
