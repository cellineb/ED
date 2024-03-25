package view;

import controller.ConverteController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ConverteController converte = new ConverteController();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal"));
		System.out.println("O número decimal " + decimal + " em binário fica" + converte.decToBin(decimal));
		JOptionPane.showMessageDialog(null, "O número decimal " + decimal + " em binário fica" + converte.decToBin(decimal));
	}

}
