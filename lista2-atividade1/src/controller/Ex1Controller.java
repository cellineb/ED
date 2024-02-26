package controller;

public class Ex1Controller {
	
	public Ex1Controller() {
		super();
	}
	
	public int multiplicar(int a, int b)
	{
		if (a==1) {
			return b;
		}
		else {
			return b + multiplicar(a-1, b);
		}
	}
	
}
