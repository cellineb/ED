package controller;

public class Ex2Controller {

	public Ex2Controller() {
		super ();
	}
	
	int resto;
	
	public int resto(int dividendo, int divisor) {
		if (dividendo<divisor) {
			return resto;
		}
		else {
			dividendo = dividendo - divisor;
			resto = resto + 1;
			return resto(dividendo, divisor);
		}
	}
	
}
