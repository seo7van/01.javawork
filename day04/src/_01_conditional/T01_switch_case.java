package _01_conditional;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {

//		swich-case
		int num1 = 2;		// 0~2만 들어있는 변수
		
		switch(num1) {
			case 1 :				// 세미콜론(;)사용 x 			콜론(:)사용 o
				System.out.println("1 입니다.");
				break; 
				/*반드시 case 끝날때마다 break 사용해야함. 
				그래야 코드 수행 후 swich문 빠져나올 수 있음*/
			case 2 :
				System.out.println("2 입니다.");
				//but 마지막 case문은 'break'안써줘도 빠져나오기 가능
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력(0~2 숫자만) : ");
		int num2 = sc.nextInt();
		
		switch(num2) {
		case 0:
			System.out.println("0입력");
			break;
		case 1:
			System.out.println("1입력");
			break;
		case 2:
			System.out.println("2입력");
			break;
		default:
			System.out.println("잘못 입력 하였습니다.");
		//스위치 케이스 문에서는 case 외의 다른 입력값은 "default"가 받음
		}
		
		char ch = 'k';			//k, l, p
		switch(ch) {
			case 'k' :
				System.out.println("김씨 입니다.");
				break;
			case 'l':
				System.out.println("이씨입니다");
				break;
			case 'p':
				System.out.println("박씨입니다");
				break;
			default:
				System.out.println("김, 이, 박씨가 아닙니다.");
		}
		System.out.println();
		
		int month = 4;
		
		switch(month) {
			case 1 :
			case 2 :
			case 12 :
				System.out.println("겨울 입니다.");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄 입니다.");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름 입니다.");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을 입니다.");
				break;
			default:
				System.out.println("잘못 입력 하였습니다.");
		}
		System.out.println();
//		ex)1. 사용자로부터 두가지 수와 연산자(+, -, *, /, %)를 입력받아 연산결과를 출력
		System.out.println("첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		
		System.out.println("두번째 숫자 입력 : ");
		int b = sc.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /, %) : ");
		char c = sc.next().charAt(0);		//string 경우 case에 ""사용
		
		switch(c) {
			case '+' :
				System.out.println("연산결과 : " + (a+b));
				break;
			case '-' :
				System.out.println("연산결과 : " + (a-b));
				break;
			case '*' :
				System.out.println("연산결과 : " + (a*b));
				break;
			case '/' :
				System.out.println("연산결과 : " + (double)a/b);
				break;
			case '%' :
				System.out.println("연산결과 : " + (a%b));
				break;
			default:
				System.out.println("잘못 입력 하였습니다.");
			}
		sc.close();
	}
	
}
