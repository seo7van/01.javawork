package _01_generics;

import java.util.*;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}			
}

class Apple extends Fruit {	
	@Override
	public String toString() {
		return "Apple";
	}			
}

class Banana extends Fruit {	
	@Override
	public String toString() {
		return "Banana";
	}			
}

class Tjoeun {
	@Override
	public String toString() {
		return "tjoeun";
	}			
}

class Box2<T>{
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
}

public class T03_GenericsExtends {

	public static void main(String[] args) {

		Box2<Fruit> fruitBox = new Box2<>();
		Box2<Apple> appleBox = new Box2<>();
		Box2<Tjoeun> tjoeunBox = new Box2<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Banana());
		//fruitBox.add(new Tjoeun());   상속 받지 않음. Fruit과 아무 연관 없음
		
		appleBox.add(new Apple());      // Apple만 담을 수 있음
		//appleBox.add(new Fruit());    부모 안됨
		
		tjoeunBox.add(new Tjoeun());    // Tjoeun만 담을 수 있음
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);
		
		
		
	}

}