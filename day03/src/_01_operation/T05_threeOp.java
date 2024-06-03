package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
//		삼항연산자 : 조건이 참 일 때 실행 : 조건이 거짓일 때 실행
		
		int num1 = 10;
		int num2 = 7;
		
		String re = num1 < num2 ? "num1의 숫자가 더 작다 " : "num1의 숫자가 더 크다";		
		System.out.println(re);
		System.out.println(num1 < num2 ? "num1의 숫자가 더 작다 " : "num1의 숫자가 더 크다");
		
//		숫자를 무조건 양수로 출력
		int num3 = -8;
		int n3 = 0 > num3 ? -num3 : num3;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println("절대값 : " + n3);
		
//		사용자로부터 점수를 입력받아서 80점이상이면 합격, 그렇지 않으면 불합격 출력
		
		//방법 1
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int jumsu = scan.nextInt();
				
		String re3 = jumsu >= 80 ? "합격" : "불합격";
		System.out.println(re3);
		
		String re4 =
		jumsu >= 90 ? "A" :
		jumsu >= 80 ? "B" :
		jumsu >= 70 ? "C" :
		jumsu >= 60 ? "D" : "F";
		System.out.println(re4);
		
		//방법2
        System.out.print("점수를 입력해주세요 : ");
		int score = scan.nextInt();
		
		System.out.println(score >= 80 ? "합격입니다." : "불합격입니다.");
		
		System.out.println(score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : (score >= 60 ? "D" : "F"))));
		String r = 
				score >= 90 ? "A" :
					score >= 80 ? "B" :
						score >= 70 ? "C" :
							score >= 60 ? "D" : "F";
							
		System.out.println(r);
		
		scan.close();
		} 
	}
