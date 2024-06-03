package _02_exception;

import java.util.Scanner;

public class T11_Exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] num = new int[3];
	
			System.out.println("정수 입력");
			
			int sum = 0;
			for(int i=0; i<num.length; i++) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				num[i] = sc.nextInt();
			}
			num[3] = 5;
			System.out.println("합계 : " + sum);
		
		} catch(Exception e) {    // 맨 아래에 위치해야 함. 모든 예외가 들어오기 때문에
			// Exception은 모든 예외클래스의 최상위 클래스
			// 모든 예외를 다 받을 수 있다
			System.out.println("예외발생");
			e.printStackTrace();
			System.out.println(e);
		}
		
		sc.close();
		
	}
}