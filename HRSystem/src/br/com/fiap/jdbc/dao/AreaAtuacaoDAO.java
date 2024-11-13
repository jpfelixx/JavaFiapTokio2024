package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.jdbc.model.Candidato;
import br.com.fiap.jdbc.model.Genero;
import br.com.fiap.jdbc.model.areaAtuacao;

public class AreaAtuacaoDAO {
	
	 private Connection conexao;

	    public  AreaAtuacaoDAO() {
	        this.conexao = new ConnectionFactory().conectar();
	    }

	   
	    public void inserir(areaAtuacao  area) {
	        String sql = "INSERT INTO areaatuacao(nome) VALUES(?)";
	        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
	            stmt.setString(1, area.getNome());

	            stmt.execute();
	            stmt.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Deletar Candidato
	    public void deletar(long idArea) {
	        String sql = "DELETE FROM areaatuacao WHERE idArea = ?";
	        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
	            stmt.setLong(1, idArea); //POSICAO DA INTERROGACAO
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Atualizar Candidato
	    public void atualizar(areaAtuacao  area) {
	        String sql = "UPDATE areaatuacao SET nome = ? , id =?";
	        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
	            stmt.setString(1, area.getNome());
	            stmt.setLong(2, area.getIdArea());
	           

	            stmt.execute();
	            stmt.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Selecionar todos os Candidatos
	    public List<areaAtuacao> selecionarTodos() {
	        List<areaAtuacao> areas = new ArrayList<>();
	        String sql = "SELECT * FROM areaatuacao order by nome"; 
	        try {
				PreparedStatement smt = conexao.prepareStatement(sql);
				
				ResultSet rs = smt.executeQuery(); // Pega os dados da tabela e executa, n precisa de execute
				//dados ja estao presentes aqui, só estao em um fromato estranho;
				//preciso trasnformar os dados da tabela e transformar em obj;pos aqui é uma busca de dados já existente
				
				while(rs.next()) {
					
//					long id = rs.getLong("id") ;
//					String nome = rs.getString("nome");
//					String email = rs.getString("email");;
//					Date dataCadastro = rs.getDate("dataCadastro");
//					
//					Usuario user = new Usuario(id,nome,email,dataCadastro);
//					listaUsuarios.add(user);
					
					areaAtuacao area = new areaAtuacao();
			
					area.setNome(rs.getString("nome"));
					area.setIdArea(rs.getLong("idArea"));
					
					areas.add(area);
						
				}
				
				smt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        return areas;
	    }

	    // Selecionar Candidato por ID
	    public areaAtuacao selecionarPorId(long idArea) {
	        areaAtuacao area = new areaAtuacao();
	        String sql = "SELECT * FROM areaatuacao WHERE  idArea= ?";
	        			try {
				PreparedStatement smt = conexao.prepareStatement(sql);
				smt.setLong(1,idArea);
				ResultSet rs = smt.executeQuery(); // Pega os dados da tabela
				//dados ja estao presentes aqui, só estao em um fromato estranho;
				//preciso trasnformar os dados da tabela e transformar em obj;pos aqui é uma busca de dados já existente
				
				while(rs.next()) {	
					area.setNome(rs.getString("nome"));
					area.setIdArea(rs.getLong("idArea"));
					
				}
				
				smt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return area;
	    }

}

