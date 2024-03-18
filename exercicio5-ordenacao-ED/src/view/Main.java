package view;

import celline.QuickSort;

public class Main {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		
		int[] vetEx1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetEx2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetEx3 = {31, 32, 33, 34, 99, 98, 97, 96};
		
		int tamanho1 = vetEx1.length - 1;
		int tamanho2 = vetEx2.length - 1;
		int tamanho3 = vetEx3.length - 1;
		
		vetEx1 = quickSort.ordenar(vetEx1, 0, tamanho1);
		vetEx2 = quickSort.ordenar(vetEx2, 0, tamanho2);
		vetEx3 = quickSort.ordenar(vetEx3, 0, tamanho3);
		
		System.out.println("Exercicio 1: ");
		for (int i = 0; i <= tamanho1; i++) {
			System.out.print(vetEx1[i] + " ");
		}
		System.out.println(" ");
		
		System.out.println("Exercicio 2: ");
		for (int i = 0; i <= tamanho2; i++) {
			System.out.print(vetEx2[i] + " ");
		}
		System.out.println(" ");
		
		System.out.println("Exercicio 3: ");
		for (int i = 0; i <= tamanho3; i++) {
			System.out.print(vetEx3[i] + " ");
		}
	}

}
