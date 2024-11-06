package JavaPoo.aulas.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistLinkedList {

	public static void main(String[] args) {
		List<Usuario> users = new ArrayList<Usuario>();

		Usuario juan = new Usuario(10, "Joao", "123juan");		Usuario mih = new Usuario(2, "Mellena", "123mih");		Usuario jo = new Usuario(32, "Jossana", "123joss");
		Usuario maris = new Usuario(42, "Maris", "123popi");
		Usuario Jesus = new Usuario(15, "Jesus", "123jesus é fiel");

		users.add(juan);
		users.add(mih);
		users.add(jo);
		users.add(maris);
		users.add(Jesus);

		Collections.sort(users);

		for (Usuario u : users) {
			System.out.println(u);
		}
		System.out.println("========= Pós remover =========");
		users = Usuario.remover("Joao", users);
		for (Usuario u : users) {
			System.out.println(u.getNome());
		}
	}

}
