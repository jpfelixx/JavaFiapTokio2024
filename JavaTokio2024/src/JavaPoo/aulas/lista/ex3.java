package JavaPoo.aulas.lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ex3 {

	public static void main(String[] args) {
		Collection<Integer> mtn = new LinkedList<>();
		Random r = new Random();
		
		long inicio  = System.currentTimeMillis();
	 for (int i = 0; i <1000000; i++) {
		 mtn.add(r.nextInt(1,10));	 
	}
	 long fim  = System.currentTimeMillis();
	 long tempogasto = fim-inicio;
	 System.out.println("tempo gasto é "+tempogasto);
	}
    //50000
	//Arraylist --> 6s
    // HashSet--> 5s
	//LinkedList -->4s
	
	
	//100000
	//Arraylist --> 6s
    // HashSet--> 9s
	//LinkedList -->7s
	
	//1000000
	//Arraylist --> 23s
	// HashSet--> 18s
	//LinkedList -->144s

}
