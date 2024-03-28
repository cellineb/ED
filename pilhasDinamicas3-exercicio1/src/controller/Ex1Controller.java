package controller;

import celline.Pilha;

public class Ex1Controller {

	public Ex1Controller() {
		super();
	}
	
	public int percorrerVet(int[] vet) {
		Pilha pilha = new Pilha();
		int tamanho = vet.length;
		for (int i = 0; i<tamanho; i++) {
			if (vet[i]>=0) {
				pilha.push(vet[i]);
			}
			else {
				int n1 = 0;
				int n2 = 0;
				try {
					n1 = pilha.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					n2 = pilha.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int soma = n1 + n2;
				pilha.push(n1);
				pilha.push(soma);
			}
		}
		
		int size = pilha.size();	
		return size;
		
	}

}
