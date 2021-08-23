package pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.push("Mauricio");
		System.out.println(pilha);
		pilha.push("Guilherme");
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		System.out.println(pilha);
		
		System.out.println("----- usando stack -----");
		
		Stack<String> stack = new Stack<String>();
		stack.push("Andre");
		stack.push("Beatriz");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		//peek: te fala qual é o ultimo elemento da lista
		
		System.out.println(stack.peek());
	}

}
