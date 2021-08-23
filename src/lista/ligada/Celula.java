package lista.ligada;

//Linked List: no vetor os elementos estão um do lado do outro na memória ja na lista ligada os objetos estão e, lugares diferentes da memória só que um elemento aponta para o outro
public class Celula {

	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
}
