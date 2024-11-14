package br.com.fiap.jdbc.teste;

import br.com.fiap.jdbc.Controller.AppController;
import br.com.fiap.jdbc.dao.AreaAtuacaoDAO;
import br.com.fiap.jdbc.dao.CandidatoDAO;
import br.com.fiap.jdbc.model.Candidato;
import br.com.fiap.jdbc.model.Genero;
import br.com.fiap.jdbc.model.areaAtuacao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		CandidatoDAO candidatoDAO = new CandidatoDAO();
		AreaAtuacaoDAO areaDAO = new AreaAtuacaoDAO();
        AppController app = new AppController();
//        CandidatoDAO candidatoDAO = new CandidatoDAO();
//        AreaAtuacaoDAO areaDAO = new AreaAtuacaoDAO();
//
//        areaAtuacao ti = new areaAtuacao("TI");
//        areaDAO.inserir(ti);
//        areaAtuacao rh = new areaAtuacao("RH");
//        areaDAO.inserir(rh);
//        areaAtuacao adm = new areaAtuacao("ADM");
//        areaDAO.inserir(adm);

//        Candidato joao = new Candidato("João Silva","1234-5678","joao.silva@email.com","Rua A, 123","Superior Completo",Date.valueOf("1990-05-15"), Genero.fromCodigo("F"),5.0f,1);
//        Candidato carlos = new Candidato("Carlos Souza", "4567-8901", "carlos.souza@email.com", "Avenida C, 789", "Superior Incompleto", Date.valueOf("1988-11-10"), Genero.fromCodigo("M"), 6.2f, 2);
//        Candidato anaCosta = new Candidato("Ana Costa", "1122-3344", "ana.costa@email.com", "Praça D, 101", "Pós-Graduação", Date.valueOf("1985-03-05"), Genero.fromCodigo("f"), 7.3f, 3);
//
//        List<Candidato> candidatos = new ArrayList<Candidato>();
//        candidatoDAO.inserir(joao);
//        candidatoDAO.inserir(carlos);
//        candidatoDAO.inserir(anaCosta);

		List<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos = candidatoDAO.selecionarTodos();

		System.out.println("Lista de Candidatos:");
		for (Candidato candidato : candidatos) {
			System.out.println(candidato.getNome());
		}
		Candidato c = new Candidato();

		c = candidatoDAO.selecionarPorId(1);
		System.out.println(c.getEmail());
		c.setEmail("carlito@gmail.com");
		candidatoDAO.atualizar(c);
		candidatoDAO.deletar(1);

		// Verificando se o candidato foi deletado

	}
}
