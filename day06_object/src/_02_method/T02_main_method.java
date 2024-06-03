package _02_method;

public class T02_main_method {

	public static void main(String[] args) {
		
		T02_api_method ob1 = new T02_api_method();
		
		int a = ob1.add(1, 0);
		int b = ob1.minus(2, 1);
		int c = ob1.multiply(2, 6);
		double d = ob1.divide(4, 2);
		
		System.out.println(a + " " + b + " " + c + " " + d);
	}
		 
}