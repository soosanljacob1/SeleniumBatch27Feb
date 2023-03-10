package OOPS;

public class FunctionsExample {

	public static void main(String[] args) {
		add();
		FunctionsExample.add();
		FunctionsExample fe= new FunctionsExample();
		fe.mul();
		new FunctionsExample() .mul();

	}
	public static void add() {
		System.out.println("Addition function");
	}
	public void mul() {
		System.out.println("multiplication function");
	}
	}


