package _02_exception;

class Animal{ }
class Dog extends Animal{ }
class Cat extends Animal{ }

public class T06_ClassCast {
	
	public static void main(String[] args) {
		/*
		Dog dog = new Dog();  변환가능    
		Animal animal dog = new Animal(); 변환불가
		if((change(dog)) == null) {
			System.out.println("변환불가");
		} else {
			dog = change(dog);
		}
		*/
		/*
		Animal ani = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal aniDog = dog;
		Animal aniCat = cat;
		
		dog = (Dog)aniDog;          //error X
		dog = (Dog)ani;             //error O
		*/
		try {
			Animal ani = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			Animal aniDog = dog;
			Animal aniCat = cat;
			
			dog = (Dog)aniDog;
			dog = (Dog)ani; 
		
		} catch(ClassCastException e) {
			System.out.println("부모타입을 자식의 타입으로 형변환할 수 없음");
		}
	}
	/*
	public static void change(Animal animal) {
		Dog dog = null;
		if(animal instanceof Dog) {      //catch문을 역할을 해줌
			dog = (Dog)animal;
		} else {
			System.out.println("변경불가");
		}
	*/
}