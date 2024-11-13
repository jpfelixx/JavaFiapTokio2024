package br.com.fiap.jdbc.teste;
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

        areaAtuacao area = new areaAtuacao("TI");
        areaDAO.inserir(area);

		Date dataNasc = Date.valueOf("1990-05-15");
		Genero genero = Genero.fromCodigo("f");
        System.out.println("Gênero: " + genero);
    

        // 1. Inserindo um novo candidato
        Candidato candidato1 = new Candidato(
            "João Silva",                
            "1234-5678",                
            "joao.silva@email.com",      
            "Rua A, 123",               
            "Superior Completo", 
           dataNasc,  // Data de Nascimento
           genero,
             5.0f,                      
            1                            
        );
         
        List<Candidato> candidatos = new ArrayList<Candidato>();
        candidatoDAO.inserir(candidato1);
        candidatos = candidatoDAO.selecionarTodos();
        
        
       System.out.println("Lista de Candidatos:");
       for (Candidato candidato : candidatos) {
           System.out.println(candidato.getNome());
       }

       

       

        // Verificando se o candidato foi deletado
       
    }
}
