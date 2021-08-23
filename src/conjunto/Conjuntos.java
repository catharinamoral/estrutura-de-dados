package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Não pode haver mais de um objeto igual em um conjunto
//Vamos criar uma lista para cada letra do alfabeto, assim quando formos verificar se uma palvra já existe no conjunto nós podemos percorrer uma lista filtrada

public class Conjuntos {

	//Usamos um ArrayList para ser mais performatico pois estamos usando o metodo get()
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	//26 listas dentro do Conjunto, uma para cada letra do alfabeto
	public Conjuntos() {
		for(int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	public void adiciona(String palavra) {
		if(!contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice);
			
			lista.add(palavra);
		}	
	}

	public void remove(String palavra) {
		if(contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}
	
	//função de hash
	private boolean contem(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		return tabela.get(indice).contains(palavra);
	}

	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
	
}
