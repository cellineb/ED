package controller;

import celline.Pilha;

public class ConverteController {
	
	public ConverteController() {
		super();
	}
	
	Pilha pilha = new Pilha();
	
	public String decToBin(int decimal) {
		while (decimal / 2 != 0) {
			pilha.push(decimal%2);
			decimal = decimal/2;
		}
		pilha.push(decimal%2);
		decimal = decimal/2;

		String numero = " ";
		int size = pilha.size();
		
		for (int i=0; i<size; i++) {
			try {
				numero = numero + pilha.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return numero;
	}

}
