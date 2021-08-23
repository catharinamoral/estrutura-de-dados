package vetor.escola;

import java.util.Arrays;

//armazenamento sequencial: guardar um aluno atr�s do outro
//vamos ter um conjunto de espa�os, o primeio aluno vai para o primeiro espa�o, o segundo vai para o segundo espa�o etc
//o array � um recurso da linguagem que nos ajuda nisso
// Vetor � o nome que damos para a estrutura de dados com armazenamento sequencial
public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	//descobrir qual posi��o est� nula para guardar o aluno, adiciona no final
	public void adiciona(Aluno aluno) {
		//essa solu��o tem um tempo constante, independente de quantos elemnteos a gente tem no array, a performace dela vai ser sempre a mesma
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	
	//adiciona um aluno em uma posiciao que ja esta ocupada
	//O(n) -> quanto maior a lista mais ter� que percorrer
	public void adiciona(int posicao, Aluno aluno) {
		
		//o loop come�a no fim (totalDeAlunos - 1), total de alunos aponta para a proxima posi��o vazia
		for(int i = totalDeAlunos - 1; i >= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}
	
	public Aluno pega(int posicao) {
		return alunos[posicao];
	}
	
	//remover o objeto que esta na posi��o e empurrar os outros para a esquerda
	public void remove(int posicao) {
		
		//come�a na posicao que voc� quer remover
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		
		totalDeAlunos--;
	}
	
	//nesse m�todo n�o tem jeito, temos que percorrer a lista inteira
	//O(n) -> o tempo dela varia de acordo com a execu��o dos elementos
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho(){
		return totalDeAlunos;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}
}
