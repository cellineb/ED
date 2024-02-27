package controller;

public class Ex4Controller {
	
	public Ex4Controller() {
		super();
	}
	
	public int duploFat(int N) {
		if (N == 1) {
			return 1;
		}
		else {
			return N * duploFat(N-2);
		}
	}

}
