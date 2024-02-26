package controller;

import javax.swing.JOptionPane;

public class Ex2Controller {
	
	public Ex2Controller() {
		super();
	}
	
	public int resolucao(int[] vetor, int tamanho, int ultimaposicao) {
		if (tamanho == 1) {
			return vetor[0];
		}
		else if (vetor[tamanho-1]<vetor[tamanho-2]) {
			return resolucao(vetor, tamanho - 1, ultimaposicao);
		}
		else {
			return resolucao(vetor, tamanho - 2, ultimaposicao);
		}
	}
	
}						
