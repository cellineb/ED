package view;

import javax.swing.JOptionPane;
import controller.Ex4Controller;

public class Ex4 {

	public static void main(String[] args) {
		Ex4Controller ex4 = new Ex4Controller();
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		while (N < 0 || N%2==0 || N == 0){
			N = Integer.parseInt(JOptionPane.showInputDialog("O n�mero deve ser positivo e �mpar. Digite novamente"));
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial duplo de " + N + " �: " + ex4.duploFat(N));
		System.out.println("O fatorial duplo de " + N + " �: " + ex4.duploFat(N));

	}

}
