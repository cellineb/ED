package celline;

public class MergeSort {
	
	public MergeSort() {
		super();
	}
	
	public int[] ordenar(int[] vet, int inicio, int fim) {
		
		if (inicio < fim) {
			int meio = (inicio + fim)/2;
			ordenar(vet, inicio, meio);
			ordenar(vet, meio + 1, fim);
			intercala(vet, inicio, meio, fim);
		}
		
		return vet;
	}
	
	public void intercala(int[] vet, int inicio, int meio, int fim) {
		int[] novoVetor = new int[vet.length];
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vet[i];
		}
		
		int pEsquerda = inicio;
		int pDireita = meio + 1;
		
		for (int cont = inicio; cont<= fim; cont++) {
			if (pEsquerda>meio) {
				vet[cont] = novoVetor[pDireita];
				pDireita++;
			}
			else if (pDireita > fim) {
				vet[cont] = novoVetor[pEsquerda];
				pEsquerda++;
			}
			else if (novoVetor[pEsquerda] < novoVetor[pDireita]) {
				vet[cont] = novoVetor[pEsquerda];
				pEsquerda++;
			}
			else {
				vet[cont] = novoVetor[pDireita];
				pDireita++;
			}
		}
	}

}
