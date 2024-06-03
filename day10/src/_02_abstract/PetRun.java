package _02_abstract;

public class PetRun {
	
	public static void main(String[] args) {

		Pet pet1 = new Cat("페르시안", "흰색", "새침함");

		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색깔 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println();
		/*		
		Pet pet2 = new Parrot();
		
		System.out.print("울음소리 : ");
		pet2.sound();
		System.out.println("종류 : " + pet2.getKind());
		System.out.println("색깔 : " + pet2.getColor());
		System.out.println("특징 : " + pet2.getFeature());
		*/
		pet1 = new Cat();
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색깔 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println();
		
		pet1 = new Dog();
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색깔 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		
	}

}