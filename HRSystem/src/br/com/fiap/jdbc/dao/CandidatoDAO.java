package br.com.fiap.jdbc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.jdbc.model.Candidato;
import br.com.fiap.jdbc.model.Genero;

public class CandidatoDAO {

    private Connection conexao;

    public CandidatoDAO() {
        this.conexao = new ConnectionFactory().conectar();
    }

   
    public CandidatoDAO(Connection connection) {
    	this.conexao = connection;
	}


	public void inserir(Candidato candidato) {
        String sql = "INSERT INTO candidato(nome, telefone, email, endereco, formacao, data_nasc, genero, tempo_experiencia, idArea) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, candidato.getNome());
            stmt.setString(2, candidato.getTelefone());
            stmt.setString(3, candidato.getEmail());
            stmt.setString(4, candidato.getEndereco());
            stmt.setString(5, candidato.getFormacao());
            stmt.setDate(6, candidato.getData_nasc());
            stmt.setString(7, candidato.getGenero().name());  // Convertendo enum Genero para String
            stmt.setFloat(8, candidato.getTempo_experiencia());
            stmt.setLong(9, candidato.getIdArea());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Deletar Candidato
    public void deletar(long idCandidato) {
        String sql = "DELETE FROM candidato WHERE idcandidato = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setLong(1, idCandidato); //POSICAO DA INTERROGACAO
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Atualizar Candidato
    public void atualizar(Candidato candidato) {
        String sql = "UPDATE candidato SET nome = ?, telefone = ?, email = ?, endereco = ?, formacao = ?, data_nasc = ?, genero = ?, tempo_experiencia = ?, idArea = ? WHERE idcandidato = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, candidato.getNome());
            stmt.setString(2, candidato.getTelefone());
            stmt.setString(3, candidato.getEmail());
            stmt.setString(4, candidato.getEndereco());
            stmt.setString(5, candidato.getFormacao());
            stmt.setDate(6, candidato.getData_nasc());
            stmt.setString(7, candidato.getGenero().name()); // Convertendo enum Genero para String
            stmt.setFloat(8, candidato.getTempo_experiencia());
            stmt.setLong(9, candidato.getIdArea());
            stmt.setLong(10, candidato.getIdcandidato());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Selecionar todos os Candidatos
    public List<Candidato> selecionarTodos() {
        List<Candidato> candidatos = new ArrayList<>();
        String sql = "SELECT * FROM candidato"; // Consulta SQL para selecionar todos os candidatos
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql); // Criando o PreparedStatement
             ResultSet rs = stmt.executeQuery()) { // Executa a query e obtém o ResultSet

            // Iterando sobre o ResultSet
            while (rs.next()) {
                // Criando um novo objeto Candidato para cada linha do ResultSet
                Candidato candidato = new Candidato();
                
                // Preenchendo o objeto Candidato com os dados da linha do ResultSet
                candidato.setIdcandidato(rs.getLong("idcandidato"));
                candidato.setNome(rs.getString("nome"));
                candidato.setTelefone(rs.getString("telefone"));
                candidato.setEmail(rs.getString("email"));
                candidato.setEndereco(rs.getString("endereco"));
                candidato.setFormacao(rs.getString("formacao"));
                candidato.setData_nasc(rs.getDate("data_nasc"));
                candidato.setGenero(Genero.valueOf(rs.getString("genero")));  // Convertendo de String para enum Genero
                candidato.setTempo_experiencia(rs.getFloat("tempo_experiencia"));
                candidato.setIdArea(rs.getLong("idArea"));
                
                // Adicionando o candidato à lista
                candidatos.add(candidato);
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Em caso de erro, exibe a stack trace
        }

        // Retornando a lista de candidatos
        return candidatos;
    }


    // Selecionar Candidato por ID
    public Candidato selecionarPorId(long idCandidato) {
        Candidato candidato = new Candidato(); // Criando um objeto vazio de Candidato
        String sql = "SELECT * FROM candidato WHERE idcandidato = ?"; // Consulta para selecionar o candidato pelo ID
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) { // Criando o PreparedStatement
            stmt.setLong(1, idCandidato); // Definindo o parâmetro do ID

            try (ResultSet rs = stmt.executeQuery()) { // Executando a consulta e obtendo o ResultSet
                if (rs.next()) { // Se o candidato for encontrado
                    // Preenchendo os dados do candidato com os resultados do ResultSet
                    candidato.setIdcandidato(rs.getLong("idcandidato"));
                    candidato.setNome(rs.getString("nome"));
                    candidato.setTelefone(rs.getString("telefone"));
                    candidato.setEmail(rs.getString("email"));
                    candidato.setEndereco(rs.getString("endereco"));
                    candidato.setFormacao(rs.getString("formacao"));
                    candidato.setData_nasc(rs.getDate("data_nasc"));
                    candidato.setGenero(Genero.valueOf(rs.getString("genero")));  // Convertendo de String para enum Genero
                    candidato.setTempo_experiencia(rs.getFloat("tempo_experiencia"));
                    candidato.setIdArea(rs.getLong("idArea"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // 
           // Em caso de erro, imprime a stack trace
        }

        // Retornando o candidato encontrado (ou um objeto vazio caso não tenha sido encontrado)
        return candidato;
    }

}
