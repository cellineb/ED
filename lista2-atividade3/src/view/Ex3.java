package view;

import javax.swing.JOptionPane;
import controller.Ex3Controller;

public class Ex3 {

	public static void main(String[] args) {
		Ex3Controller ex3 = new Ex3Controller();
		int[] vetor = {3, 80, 9, 5, 12, 8, 47, 1, 4, 6, 25};
		int tamanho = vetor.length - 1;
		
		JOptionPane.showMessageDialog(null, "A quantidade de números pares no vetor é: " + ex3.pares(vetor, tamanho));
		System.out.println("A quantidade de números pares no vetor é: " + ex3.pares(vetor, tamanho));

	}

}
