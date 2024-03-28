package view;

import controller.Ex1Controller;

public class Principal {

	public static void main(String[] args) {
		Ex1Controller ex1 = new Ex1Controller();
		int[] vet = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		System.out.println("A quantidade de valores na pilha é: " + ex1.percorrerVet(vet));
	}

}
