package controller;

public class Ex3Controller {
	
	public Ex3Controller() {
		super();
	}
	
	public int fatorial(int N)
	{
		if (N==0) {
		return 1;
		}
		else {
			return N * fatorial(N-1);
		}
		
	}
	
}
