package controller;

public class Ex5Controller {
	
	public Ex5Controller() {
		super();
	}
	
	public double soma(double N) {
		
		// a condição de parada é até o número for igual a 1.
		if (N == 1) {
			return 1;
		}
		else {
			return 1/N + soma(N-1);
		}
	}
	
}
