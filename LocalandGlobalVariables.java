package OOPS;

public class LocalandGlobalVariables {
 static int c;
	public static void main(String[] args) {
		int a=100;
		System.out.println(a);
	
		System.out.println(c);
		LocalandGlobalVariables lg=new LocalandGlobalVariables();
		lg.add();

	}
public void add() {
	int b=200;
	
	System.out.println(b);
	System.out.println(c);
}
}

