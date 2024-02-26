package view;

import javax.swing.JOptionPane;
import controller.Ex2Controller;

public class Ex2 {

	public static void main(String[] args) {
		Ex2Controller ex2 = new Ex2Controller();
		
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número dividendo:"));
		int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número divisor:"));
		
		JOptionPane.showMessageDialog(null, "O resto da multiplicação é " + ex2.resto(dividendo, divisor));
		System.out.println("O resto da multiplicação é " + ex2.resto(dividendo, divisor));

	}

}
