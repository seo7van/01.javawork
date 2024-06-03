package _02_repetitive;

public class T05_random {

	public static void main(String[] args) {
/*	Math 클래스 - 수학과 관련된 클래스 
		객체 생성하지 않고 사용함
		자바 내부에서 지원하는 Math 클래스임*/
		
		double random1 = Math.random();
		System.out.println(random1 + "\n"); //실수형 : 0 ~ 0.99999999 * 10
		
		random1 = Math.random() * 10;
		System.out.println(random1 + "\n"); //실수형 : 0 ~ 0.99999999
		
		int random2 = (int)random1; //정수 : 0~9
		System.out.println(random2 + "\n");
		
		int random3 = (int)random1 + 1; //정수로 강제 형변환한 후 1 증가 1~10
		System.out.println(random3 + "\n");
		
//		0~4까지 숫자 중 랜덤으로 추출함
//		0 ~ 0.999999 * 5 = 0 ~ 4.999999
		int random4 = (int)(Math.random()*5);
		System.out.println(random4 + "\n");
		
		int random5 = random4 + 1; //1~5
		System.out.println(random5 + "\n");
	}
}
