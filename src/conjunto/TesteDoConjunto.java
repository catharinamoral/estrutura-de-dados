package conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteDoConjunto {

	public static void main(String[] args) {
		
		Conjuntos conjunto = new Conjuntos();
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Marina");
		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);
		
		conjunto.remove("Mauricio");
		System.out.println(conjunto);
		
		System.out.println("---- usando Set ----");
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		
		conjuntoDoJava.add("Esther");
		conjuntoDoJava.add("Paulo");
		
		System.out.println(conjuntoDoJava);
		
		//o HashSet no java funciona pelo hashCode
		System.out.println("Esther".hashCode());
		System.out.println("Esther".hashCode());
	}
}
