package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Andrei");
		fila.adiciona("Beatriz");
		System.out.println(fila);

		fila.remove();
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		System.out.println("---- usando queue ----");
		
		Queue<String> filaDoJava = new LinkedList<String>();
		
		filaDoJava.add("Carolina");
		System.out.println(filaDoJava);
		
		filaDoJava.poll(); //remove o primeiro
		System.out.println(filaDoJava);
	}

}
