package view;

import javax.swing.JOptionPane;
import controller.Ex2Controller;

public class Ex2 {

	public static void main(String[] args) {
		Ex2Controller ex2vetor = new Ex2Controller();
		int[] vetor = {5, 4, 12, 26, 3};
		int tamanho = vetor.length;
		int ultimaposicao = tamanho-1;
		JOptionPane.showMessageDialog(null, "O menor número do vetor é: " + ex2vetor.resolucao(vetor, tamanho, ultimaposicao));
	}

}
