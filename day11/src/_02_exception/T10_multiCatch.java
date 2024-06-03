package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_multiCatch {

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
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어섬");
			
		} catch(InputMismatchException e) {
			System.out.println("정수만 넣으세요");
			
		} catch(Exception e) {
			System.out.println("예외발생");
		}
		
		sc.close();
		
	}
}