package view;

import javax.swing.JOptionPane;
import controller.Ex5Controller;

public class Ex5 {

	public static void main(String[] args) {
		Ex5Controller ex5 = new Ex5Controller();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		double N = x;
		System.out.println("A somatória é: " + ex5.soma(N));

	}

}
