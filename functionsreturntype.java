package OOPS;

public class functionsreturntype {

	public static void main(String[] args) {
		functionsreturntype fe= new functionsreturntype();
		int d= fe.add(1, 2);
		System.out.println(d);

	}
	public int add(int a, int b) {
		int c= a+b;
		System.out.println(c);
		return c;
	}

}
