package _01_print;

public class T02_print {

	public static void main(String[] args) {
		// 십진수 출력
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 10, 20);
		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d, %d\n", num1, num2);
		
		//8진수 출력
		System.out.printf("%x\n", 13);

		
//		16진수 출력
		System.out.pritf(%x\n",13);
		//실수형 출력
		System.out.printf("%f\n", 3.55555555555555555555);
		
		//문자1개 출력
		System.out.printf("%c\n", 'm');
		
		//문자열 출력
		System.out.printf("%s\n", "abcdefg");
		
		//boolean타입 출력
		System.out.printf("%b\n",true);
		System.out.printf("%b\n", 7>3);
	
		// 현재는 2024년 5월이고, 우리나라의  평균키는 165.7 입니다.
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균키는 %f입니다", 2024, 5, 165.7);
	}

}
