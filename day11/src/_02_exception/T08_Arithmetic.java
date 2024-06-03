package _02_exception;

import java.util.Scanner;

public class T08_Arithmetic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 수를 입력해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	
		try {
			System.out.println("몫 : " + a / b);
			System.out.println("나머지 : " + a % b);
		} catch(ArithmeticException e) {
			System.out.println("나눌 수 없는 수 입니다.");
		}
		
		sc.close();
		
	}
}