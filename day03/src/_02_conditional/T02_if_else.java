package _02_conditional;

import java. util.Scanner; 

public class T02_if_else {

	public static void main(String[] args) {
		
/*	if(조건식) {
		조건이 참일때 실행할 프로그램}
		} else {
		조건이 거짓일 때 실행할 프로그램
		}*/
		
//		이것또한 실행할 프로그램이 한줄이면 중괄호 생략가능
		int num1 = 100;
		if(num1 > 0) //여기서는 세미콜론 안붙힘 
		System.out.println("양수");
		else
			System.out.println("양수가 아니다");
		
//		실행할 프로그램이 한 줄 이상이면 중괄호를 반드시 붙힘
		int score = 78;
		if(score >= 80) {
			System.out.println("축하합니다.");
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격 입니다.");
			System.out.println("다음 기회에 !!!");
		}
		
//		ex) 사용자로부터 숫자 하나를 입력받아 짝수, 홀수를 구분
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		sc.close();
	}
}
