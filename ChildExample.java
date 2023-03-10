package OOPS;

public class ChildExample extends ParentExample {

	public static void main(String[] args) {
		ChildExample ce= new ChildExample();
		ce.childtest();
		ce.parenttest();
        ce.test();
        ParentExample pe1= new ChildExample();
        pe1.test();
	}
	public void childtest() {
		System.out.println("Child Testing");
	}
public void test() {
	System.out.println("Test1");
	System.out.println("New");
}
}
