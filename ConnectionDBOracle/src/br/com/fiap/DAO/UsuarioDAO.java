package br.com.fiap.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.connection.Model.Usuario;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
		//Ao criar UM OBJ DAO ELE AUTO CRIA UMA CONEXAO
	}
	
	//insert
	public void inserir(Usuario user) {
		String sql = "insert into usuario(nome,email,dataCadastro) values(?,?,?)";
		try {
			PreparedStatement smt = conexao.prepareStatement(sql);
			smt.setString(1, user.getNome());
			smt.setString(2, user.getEmail());
			smt.setDate(3, user.getDataCadastro());
			smt.execute();
			smt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//delete
	public void deletar(long id) {
		String sql = "delete from usuario where id =?";
		try {
			PreparedStatement smt = conexao.prepareStatement(sql);
			smt.setLong(1, id);
			smt.execute();
			smt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//update
	public void update(Usuario user) {
		String sql = "update usuario set nome =?, email=? ,dataCadastro=? where id =?";
		try {
			PreparedStatement smt = conexao.prepareStatement(sql);
			//smt --> Statement
			smt.setString(1, user.getNome());
			smt.setString(2, user.getEmail());
			smt.setDate(3, user.getDataCadastro());
			smt.setLong(4, user.getId());
			smt.execute();
			smt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//selectAll
	public List<Usuario> selecionarTodos() {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String sql = "select * from usuario";
		try {
			PreparedStatement smt = conexao.prepareStatement(sql);
			
			ResultSet rs = smt.executeQuery(); // Pega os dados da tabela e executa, n precisa de execute
			//dados ja estao presentes aqui, só estao em um fromato estranho;
			//preciso trasnformar os dados da tabela e transformar em obj;pos aqui é uma busca de dados já existente
			
			while(rs.next()) {
				
//				long id = rs.getLong("id") ;
//				String nome = rs.getString("nome");
//				String email = rs.getString("email");;
//				Date dataCadastro = rs.getDate("dataCadastro");
//				
//				Usuario user = new Usuario(id,nome,email,dataCadastro);
//				listaUsuarios.add(user);
				
				Usuario user = new Usuario();
				user.setId(rs.getLong("id"));
				user.setNome(rs.getString("nome"));
				user.setEmail(rs.getString("email"));
				user.setDataCadastro(rs.getDate("dataCadastro"));
				listaUsuarios.add(user);
					
			}
			
			smt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuarios;
		
	}
	
	//selectById
	public Usuario selecionarPeloId(long id) {
		Usuario user = new Usuario();
		String sql = "select * from usuario where id=?";
		try {
			PreparedStatement smt = conexao.prepareStatement(sql);
			smt.setLong(1,id);
			ResultSet rs = smt.executeQuery(); // Pega os dados da tabela
			//dados ja estao presentes aqui, só estao em um fromato estranho;
			//preciso trasnformar os dados da tabela e transformar em obj;pos aqui é uma busca de dados já existente
			
			while(rs.next()) {	
				user.setId(rs.getLong("id"));
				user.setNome(rs.getString("nome"));
				user.setEmail(rs.getString("email"));
				user.setDataCadastro(rs.getDate("dataCadastro"));
						
			}
			
			smt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
