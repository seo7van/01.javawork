package _02_abstract;

public class Dog extends Pet{
	
	/*	String kind;
		String color;*/
	
	Dog(){
		super("비글", "갈색", "활발함");
	}
	Dog(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	@Override
	void info() {
		
	}
	
}