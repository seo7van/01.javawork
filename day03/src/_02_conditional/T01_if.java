package _02_conditional;

import java.util.Scanner;

public class T01_if {

	public static void main(String[] args) {
//		조건문
//		if(조건식) : 조건이 참일때 실행할 프로그램
		int num1 = 100;
		if(num1 == 100) {
			System.out.println("100점 입니다.");
		}
//			if문 실행할 코드가 한 줄 일때는 중괄호를 {} 넣어도 되고 안넣어도 됨
			if(num1 == 100)
			System.out.println("100점 입니다.");
			
//			if문 실행할 코드가 한 줄 이상일때는 반드시 중괄호를 넣어줌
			if(num1 == 100) {
				System.out.println("100점 입니다.");
				System.out.println("안녕");
			}
			
//			한줄이어도 다른사람이 보기 헷갈리지 않도록 항상 중괄호를 넣자
			int num2 = 95;
			if (num1 < num2) {
				System.out.println(num1 + "은" + num2 + "보다 작다");
			}
			
//			사용자로부터 점수를 입력받아 80점 이상히면 합격입니다. 축하합니다.
			Scanner sc = new Scanner (System.in);
			
			System.out.println("점수를 입력하세요 : ");
			int n = sc.nextInt();
			if(n>=80) {
				System.out.println("합격입니다. 축하합니다.");
			}
			sc.close();
		}
}
