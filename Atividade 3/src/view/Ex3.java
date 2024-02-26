package view;

import javax.swing.JOptionPane;

import controller.Ex3Controller;

public class Ex3 {

	public static void main(String[] args) {
		Ex3Controller ex3 = new Ex3Controller();
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número até 12"));
		if (N>12) {
			N = Integer.parseInt(JOptionPane.showInputDialog("O número não pode ser maior que 12. Digite novamente"));
		}
		System.out.println("O fatorial de " + N + " é: " + ex3.fatorial(N));

	}

}
