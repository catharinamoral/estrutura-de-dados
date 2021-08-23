package lista.duplamente.ligada;

//Linked List: no vetor os elementos est�o um do lado do outro na mem�ria ja na lista ligada os objetos est�o e, lugares diferentes da mem�ria s� que um elemento aponta para o outro
public class Celula {

	private Object elemento;
	private Celula proximo;
	private Celula anterior;
	
	public Celula(Object elemento) {
		this(elemento, null);
	}
	
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

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	
	
	
}
