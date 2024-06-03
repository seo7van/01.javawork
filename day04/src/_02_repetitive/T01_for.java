package _02_repetitive;

public class T01_for {

	public static void main(String[] args) {
			
/*	반복문 3가지 : for, while, do-while
		특정한 규칙이 있는 것들을 반복하여 사용할 때 사용*/

/*		
 		for(초기화; 조건식; 증감식) {
				실행문
		}*/
		
		for(int i=1; i<=100; ++i) {
			System.out.println(i + ". 안녕하세요");
		}
		System.out.println();
		
		for(int i=1; i<=9; i+=2) {
			System.out.println(i + "번 출력");
		}
		System.out.println();
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println();
		
//		1~100까지의 합계 구하기
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println();
		
		for(int i=1; i<=100; i++) {
			int s=0;
			s += 0;
			s += i;
			System.out.println(s);				//s값과 i값 동일
		}
		System.out.println();
		
		sum = 0;
		for(int i=1; i<=10; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
