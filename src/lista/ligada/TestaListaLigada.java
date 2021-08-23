package lista.ligada;

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
	
	}

}
