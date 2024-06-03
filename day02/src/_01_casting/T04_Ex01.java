package _01_casting;

import java.util.Scanner;

public class T04_Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1.문자하나를 입력받아 그 문자의 유니코드를 출력하기
		System.out.println("문자 1개 입력 : ");
		char c = scan.next().charAt(0); //오류를 줄여줌
		//String c = scan.next(); -> 이때 사용자가 여러 글자를 넣으면 모두 출력함
		
		System.out.println(c + "의 유니코드 : " + (int)c);
		
//		2. 국어, 영어, 수학 점수를 입력받아 총점 출력, 평균 출력(소수점 2째자리까지 출력)
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
		
//		3.
		int num1 = 10;
	    int num2 = 4;
	    float num3 = 3.0f;
	    double num4 = 2.5;
	    char num5 = 'K'; 
/*	   3.1  iNum1 / iNum2의 몫 출력
		   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
		   3.3  iNum1의 값이 10.0으로 출력되게 하기
		   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
		   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
		   3.6  iNum1 / fNum 한 결과 소수점 13자리까지 나오게 하시오
		   3.7  ch변수의 유니코드 출력하기
		   3.8  ch변수에 1을 더해 L 이 출력되게 하시오*/	    
	    
	    
//	    3-1
	    System.out.println(num1 + "/" + num2 + "의 몫 : " + num1/num2);
	    
//	    3-2
	    System.out.println((double)num1);
	    
//	    3.3
	    System.out.println((float)num1);
	    
//      3.4
	    System.out.println((float)(num1 /num2)); //double로 해도 됨
	    
	    
//	    3.5
	    System.out.println((int)(num1 /num3)); //num1/(int)num
	    
//	    3.6
	    System.out.printf("%.13f\n", (double)(num3 / num2)); 
	    
//	    3.7
	    System.out.println((char) num5);
	    
	    scan.close();
	    

	}

}
