package _01_casting;

import java.util.Scanner;

public class T04_ex01 {

	public static void main(String[] args) {
//		1.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 1개 입력 : ");
		char cha = scan.next().charAt(0);
		//String ch = scan.next();
		
		int chUni = cha;
		System.out.println(cha + "의 유니코드 : " + chUni);
		
//		2.
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		System.out.println("총점 : " + sum);
		System.out.println("총점 : " + sum/3);
		
//		3.
		int num1 = 10;
	    int num2 = 4;
	    float num3 = 3.0f;
	    double num4 = 2.5;
	    char num5 = 'K'; 
	    
//	    3-1
	    System.out.println(num1 + "/" + num2 + "의 몫 : " + num1/num2);
	    
//	    3-2
	    System.out.println((double)num1);
		
//	    3-3
	    System.out.println();
		
		
		


	}

}
