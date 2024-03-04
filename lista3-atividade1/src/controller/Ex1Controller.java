package controller;

public class Ex1Controller {

	public Ex1Controller() {
		super();
	}
	
	public int digitos (int n) {
		int quantidade = 0;
		if (n<10) {
			return 1;
		}
		else {
			quantidade = quantidade + 1;
			return quantidade + digitos(n/10);
		}
	}
}
