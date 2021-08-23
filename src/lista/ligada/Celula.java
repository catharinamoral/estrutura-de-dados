package lista.ligada;

//Linked List: no vetor os elementos est�o um do lado do outro na mem�ria ja na lista ligada os objetos est�o e, lugares diferentes da mem�ria s� que um elemento aponta para o outro
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
