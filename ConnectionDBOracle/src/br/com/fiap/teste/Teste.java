package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.connection.Model.Usuario;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario joaop = new Usuario("joao pedro","jpfelix@gmail.com");
		Usuario mellena = new Usuario("Millena","mihl@gmail.com");
		Usuario jossana = new Usuario("jo","amolhosazuis@gmail.com");
		Usuario mariaCarey = new Usuario("maris","maris@gmail.com");
		
		dao.inserir(joaop);
		dao.inserir(mellena);
		dao.inserir(jossana);
		dao.inserir(mariaCarey);
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = dao.selecionarTodos();
		
		for (Usuario usuario : usuarios) {
			
			System.out.println("Nome:"+ usuario.getNome());
			System.out.println("Nome:"+ usuario.getEmail());

		
		}
		
		Usuario marisaupdate = dao.selecionarPeloId(4);
		marisaupdate.setEmail("amoapopieodeiopepe@gmail.com");
		dao.update(marisaupdate);

		
	}

}
