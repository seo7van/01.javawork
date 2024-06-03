package _01_generics;

class Delivery<T> {	
	private T t;
	
	void set(T t) {
		this.t = t;
	}
	
	T get() {
		return t;
	}	
}

class Gmarket<T> {	}

public class T02_Generics {

	public static void main(String[] args) {

		Delivery<String> del = new Delivery<>();
		
		del.set("t-shirt");
		String str = del.get();
		
		Delivery<Integer> del2 = new Delivery<>();   // <> 안에는 기본 자료형이 아닌 객체를 넣어야 함
		del2.set(7);
		int value = del2.get();
		
		Delivery<Gmarket> del3 = new Delivery<>();
		del3.set(new Gmarket());   // new String(), new Box() 등을 넣으면 오류 발생. 무조건 Gmarket넣어야 함
		Gmarket g = del3.get();
		
		
		
	}

}