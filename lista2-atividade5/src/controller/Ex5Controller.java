package controller;

public class Ex5Controller {

	public Ex5Controller() {
		super();
	}
	
	int divisor = 2;
	int aux = 1;
	
	public int mdc(int x, int y) {
		if (x>y) {
			return mdc(x-y, y);
		}
		else if (x == y) {
			return x;
		}
		else {
			return mdc(y, x);
		}
	}
	
}
