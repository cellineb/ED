package controller;

public class Ex3Controller {

	public Ex3Controller() {
		super ();
	}
	
	int nPares = 0;
	
	public int pares(int[] vetor, int tamanho) {
		if (tamanho < 0) {
			return nPares;
		}
		
		if ((vetor[tamanho] % 2) == 0){
			nPares = nPares + 1;
		}
		
		return pares(vetor, tamanho-1);
	}
	
}
