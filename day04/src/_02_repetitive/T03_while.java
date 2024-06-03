package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
/*
  	     while(조건식) {
					조건식이 참일 때 수행
		} 
*/
		
		for(int i=1; i<=3; i++) {
				System.out.println(i);
		}
		
		int i = 1;
		while(i<=3) {
			System.out.println(i);
			i++;
		}
/*		
		int j = 10;
		while(true) {
					if(j==0)
						break;
		}
*/
		
		int sum = 0;
		int j =1;
		while(j<=100) {
			sum += j;
			j++;
//			sum += j++;
		}
		System.out.println("1~100까지 합 : " + sum);
		
		int x = 10;
		while(x-- != 0) {
			System.out.println(x);
			System.out.println(x);
		}
		
		int count = 0;
		while(true ) {
			System.out.println(++count);
			if(count == 5)
				break;
		}
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("멈추려면 'q'를 넣으세요 : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램이 종료되었습니다.");
		
//		ex)1. 사용자로부터 연산할 두 숫자와 연산자를 입력받아 그 결과를 출력
		//	연산자에 '@'를 넣으면 멈추고 그렇지 않으면 계속 입력받아 그 결과를 출력 함
		while(true) {
			System.out.println("숫자 두 개와 연산자(+,-,*,/,%)를 입력해 주세요 (종료 키 :@): ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			char c = sc.next().charAt(0);
			
			if(c == '+') {
				System.out.println(a + " + " + b + " = " + (a+b));  
				//a + c + b 할 경우 int로 자동형변환되기 때문에 중간에 ""문자를 삽입해야 함
			}
			else if(c == '-') {
						System.out.println(a + " - " + b + " = " + (a-b));
			}
			else if(c == 'x') {
						System.out.println(a + " x " + b + " = " + (a*b));
			}
			else if(c == '/') {
						System.out.println(a + " / " + b + " = " + ((double)a/b));
			}
			else if(c == '%') {
						System.out.println(a + " % " + b + " = " + (a%b));
			}
			else if(c == '@') {
						break;
			}
			else {
						System.out.println("잘못 입력 하였습니다.");
			}
			
			if(c == '@') {
				break;
			}
			switch(c) {
						case '+':
						System.out.println(a + " + " + b + " = " + (a+b));
						break;
				case '-':
						System.out.println(a + " - " + b + " = " + (a-b));
						break;
				case '*':
						System.out.println(a + " * " + b + " = " + (a*b));
						break;
				case '/':
						System.out.println(a + " / " + b + " = " + (a/b));
						break;
				case '%':
						System.out.println(a + " % " + b + " = " + (a%b));
						break;
				default:
						break;
						}		
		}
		System.out.println("프로그램이 종료 되었습니다.");
		
		sc.close();
		}
}
