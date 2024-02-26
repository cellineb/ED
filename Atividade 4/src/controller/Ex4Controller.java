package controller;

public class Ex4Controller {

	public Ex4Controller() {
		super();
	}
	
	public int nNegativo(int[] vetor, int tamanho, int negativos)
	{
		if (tamanho<0) {
			return negativos;
		}
		
		else if (vetor[tamanho]<0) {
			negativos = negativos + 1;
			return nNegativo(vetor, tamanho-1, negativos);
		}
		
		else {
			return nNegativo(vetor, tamanho-1, negativos);
		}
			
	}
	
	
}
