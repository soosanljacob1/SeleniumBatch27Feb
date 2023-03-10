package OOPS;

public class ParentExample {

	public static void main(String[] args) {
		ParentExample pe= new ParentExample();
		pe.parenttest();
		pe.test();
	}
	public void parenttest() {
		System.out.println("Parent Testing");
	}
	public void test() {
		System.out.println("Test2");
	}

}
