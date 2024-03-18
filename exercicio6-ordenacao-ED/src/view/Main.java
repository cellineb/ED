package view;

import celline.BubbleSort;
import celline.MergeSort;
import celline.QuickSort;

public class Main {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		
		int[] vet = new int[1500];
		int preencher = 1499;
		
		for (int i = 0; i < 1500; i++) {
			vet[i] = preencher;
			preencher++;
		}
		
		long tempoInicial = System.nanoTime();
		int[] vetBubble = bubbleSort.ordenar(vet);
		long tempoFinal = System.nanoTime();
		long tempoTotalBubble = (long) ((tempoFinal - tempoInicial) / Math.pow(10, -9));
		
		tempoInicial = System.nanoTime();
		int[] vetMerge = mergeSort.ordenar(vet, 0, 1499);
		tempoFinal = System.nanoTime();
		long tempoTotalMerge = (long) ((tempoFinal - tempoInicial) / Math.pow(10, -9));
		
		tempoInicial = System.nanoTime();
		int[] vetQuick = quickSort.ordenar(vet, 0, 1499);
		tempoFinal = System.nanoTime();
		long tempoTotalQuick = (long) ((tempoFinal - tempoInicial) / Math.pow(10, -9));
		
		System.out.println("O tempo de ordenação com o método BubbleSort foi de " + tempoTotalBubble + " segundos.");
		System.out.println("O tempo de ordenação com o método MergeSort foi de " + tempoTotalMerge + " segundos.");
		System.out.println("O tempo de ordenação com o método QuickSort foi de " + tempoTotalQuick + " segundos.");
		
	}

}
