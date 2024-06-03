package _01_langPackage;

class Card {
	String kind;
	int num;
	
	Card(){
		this("HEART", 7);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return "" + kind + ", " + num;
				// kind를 먼저 출력. ""아무것도 없는 문자.
	}
}

public class T03_toString {

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card("SPACE", 10);
		Card card3 = null;
		
		// 객체를 넣은 변수를 출력하면 toString()메소드가 호출됨
		// object클래스의 toString()은 패키지명.클래스명@해시코드(16진수)
		System.out.println(card1);
		System.out.println(card2);
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		//객체를 넣은 변수의 값이 null일 때는 null을 출력해줌(toString() 호출안함.)
		System.out.println(card3);
		
	}
	
}