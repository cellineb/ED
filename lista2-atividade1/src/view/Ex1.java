package view;

import javax.swing.JOptionPane;
import controller.Ex1Controller;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Controller ex1 = new Ex1Controller();
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		
		JOptionPane.showMessageDialog(null, "O resultado da multiplica��o de " + a + " por " + b + " � " + ex1.multiplicar(a, b));
		System.out.println("O resultado da multiplica��o de " + a + " por " + b + " � " + ex1.multiplicar(a, b));

	}

}
