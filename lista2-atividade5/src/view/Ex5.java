package view;

import javax.swing.JOptionPane;
import controller.Ex5Controller;

public class Ex5 {

	public static void main(String[] args) {
		Ex5Controller ex5 = new Ex5Controller();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		
		JOptionPane.showMessageDialog(null, "O MDC de " + x + " e " + y + " � " + ex5.mdc(x, y));
		System.out.println("O MDC de " + x + " e " + y + " � " + ex5.mdc(x, y));

	}

}
