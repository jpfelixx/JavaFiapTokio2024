package JavaPoo.aulas.lista;

import java.util.Iterator;
import java.util.List;

public class Usuario implements Comparable<Usuario> {

	protected int idUsuario;
	protected String nome;
	protected String senha;

	public Usuario(int idUsuario, String nome, String senha) {

		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	// O método sort chama esse aqui.
	public int compareTo(Usuario user) {
		if (this.getIdUsuario() < user.getIdUsuario())
			return -1;
		if (this.getIdUsuario() > user.getIdUsuario())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Usuario idUsuario = " + idUsuario + ", nome = " + nome + ", senha = " + senha + "]";
	}

	public static List<Usuario> remover(String nome, List<Usuario> list) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario u = iterator.next();
			if (u.getNome() == nome) {
				iterator.remove();

			}
		}
		return list;
	}

}
