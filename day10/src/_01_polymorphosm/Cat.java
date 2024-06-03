package _01_polymorphosm;

public class Cat extends Pet{
	
	//String kind, color, feature;
	
	Cat(){
		super("샴고양이", "회색", "혼자 있는 것을 좋아함");
		//this("샴고양이", "회색", "혼자 있는 것을 좋아함");
	}
	Cat(String kind, String color, String feature){
		super(kind, color, feature);
		/*this.kind = kind;
		this.color = color;
		this.feature = feature;*/
	}
	
	@Override
	void sound() {
		System.out.println("야옹야옹");
	}
	/*
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
	*/
}