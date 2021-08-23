package lista.duplamente.ligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Mauricio");
		System.out.println(lista);
		lista.adicionaNoComeco("Paulo");
		System.out.println(lista);
		lista.adicionaNoComeco("Guilherme");
		System.out.println(lista);

		lista.adicionaNoFinal("Joao");
		System.out.println(lista);
		
		lista.adicionaNoMeio(2, "Gabriel");
		System.out.println(lista);
		
		lista.removeDoFim();
		System.out.println(lista);
	
		lista.adicionaNoFinal("Camila");
		lista.adicionaNoFinal("Marcia");
		
		System.out.println(lista);
		
		lista.remove(4);
		System.out.println(lista);
		
		System.out.println(lista.contem("Marcia"));
		System.out.println(lista.contem("Catharina"));
	}

}