package view;

import javax.swing.JOptionPane;

import controller.Ex4Controller;

public class Ex4 {

	public static void main(String[] args) {
		Ex4Controller ex4 = new Ex4Controller();
		int vetor[] = {-2, 5, 16, -3, 0, -7};
		int tamanho = vetor.length;
		int negativos =0;
		System.out.println("A quantidade de números negativos presente no vetor é: " + ex4.nNegativo(vetor, tamanho, negativos));

	}

}
