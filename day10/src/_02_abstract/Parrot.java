package _02_abstract;

public class Parrot extends Pet{
	
	/*	String kind;
		String color;*/
	
	Parrot(){
		super("코뉴어", "파인애플", "귀여움");
	}
	Parrot(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	void sound() {
		System.out.println("안녕");
	}
	@Override
	void info() {
		
	}
	
}