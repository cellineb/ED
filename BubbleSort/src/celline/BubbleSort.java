package celline;

public class BubbleSort {
	
	public BubbleSort() {
		super();
	}
	
	public int[] ordenar(int[] vet) {
		int tamanho = vet.length - 1;
		int aux;
		
		for (int x = 0; x < tamanho; x++) {
			for (int i = 0; i <= tamanho-1; i++) {
				if (vet[i]>vet[i+1]) {
					aux = vet[i];
					vet[i] = vet[i+1];
					vet[i+1] = aux;
				}
			}
		}
		
		return vet;
	}

}