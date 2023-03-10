package OOPS;

public class functionsparameter {

	public static void main(String[] args) {
		functionsparameter fe= new functionsparameter();
		fe.test();
		fe.add();
		fe.add1(1, 1);
		fe.add1(2, "soos");
	}
	
	public void test() {
		int a=100;
		System.out.println(a);
	}
	
	public void add() {
		int a=100;
		int b=200;
		int c= a+b;
		System.out.println(c);
	}
	
	public void add1(int i,int j) {
		int k=i+j;
		System.out.println(k);
	}
	public void add1(int i,String c) {
		String k=i+c;
		System.out.println(k);
	}
	}
	


