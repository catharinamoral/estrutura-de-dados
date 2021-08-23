package pilha;

import java.util.LinkedList;
import java.util.List;

//Pilhas: voc� sempre tira o primeiro, n�o da para tirar os que est�o embaixo
public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	//insere
	public void push(String nome) {
		nomes.add(nome);
		
	}
	
	//remove
	public String pop() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazia() {
		return nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}

}
