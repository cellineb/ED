package celline;

public class QuickSort {
	
	public QuickSort() {
		super();
	}
	
	public int[] ordenar(int[] vet, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoPivoFixo = dividir(vet, inicio, fim);
			ordenar(vet, inicio, posicaoPivoFixo-1);
			ordenar(vet, posicaoPivoFixo+1, fim);
		}
		return vet;
	}
	
	private int dividir(int[] vet, int inicio, int fim) {
		int pEsquerda = inicio + 1;
		int pDireita = fim;
		int pivo = vet[inicio];
		
		while(pEsquerda <= pDireita) {
			while (pEsquerda <= pDireita && vet[pEsquerda] <= pivo) {
				pEsquerda++;
			}
			while (pDireita >= pEsquerda && vet[pDireita] > pivo) {
				pDireita--;
			}
			if (pEsquerda < pDireita) {
				trocar(vet, pEsquerda, pDireita);
				pEsquerda++;
				pDireita--;
			}
		}
		
		trocar(vet, inicio, pDireita);
		return pDireita;
	}
	
	private void trocar(int[] vet, int i, int j) {
		int aux = vet[j];
		vet[j] = vet[i];
		vet[i] = aux;
	}

}
