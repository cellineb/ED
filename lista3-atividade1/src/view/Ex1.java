package view;

import javax.swing.JOptionPane;
import controller.Ex1Controller;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Controller ex1 = new Ex1Controller();
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		System.out.println("A quantidade de dígitos do número " + N + " é: " + ex1.digitos(N) + ".");
		JOptionPane.showMessageDialog(null, "A quantidade de dígitos do número " + N + " é: " + ex1.digitos(N) + ".");
	}

}
