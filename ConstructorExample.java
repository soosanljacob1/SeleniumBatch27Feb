package OOPS;

public class ConstructorExample {
	public ConstructorExample() {
		System.out.println("Constructor Example");
	}
	public ConstructorExample(int i) {
		System.out.println(i);
	}
	public ConstructorExample(char c) {
		System.out.println(c);
	}
	public static void main(String[] args) {
		ConstructorExample ce1= new ConstructorExample();
		ConstructorExample ce2= new ConstructorExample('#');
		ce1.add();
	

	}
	public void add() {
		System.out.println("Add Method");
	}

}
