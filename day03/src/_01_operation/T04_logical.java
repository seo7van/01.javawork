package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
//		논리합과 논리곱
/*	x   y  논리합(||)   논리곱(&&)
		0  0        0                      0              
		0  1         0                      1
		1  0         0                      1
		1   1         1                      1              
		논리합(||)은 하나라도 참이면 참, 논리곱(&&)은 하나라도 거짓이면 거짓
		flase = 0, true = 1   
*/
		
		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1 > num2 && num1 <= num2; //f(0) = f(0) && t(1)
		System.out.println(re1);
		
//		! <-not 반대라는 뜻
		re1 = !re1;
		System.out.println(re1);
		boolean b1 = false;
		System.out.println(!b1);
		
		char ch = 'K';    // 유니코드 표로 'K'는 숫자 75 임
		System.out.println(ch);
		System.out.println(" 소문자 인가? " + (ch >= 'a' && ch <= 'z')); // 97~122
		System.out.println(" 대문자 인가? " + (ch >= 'A' && ch <= 'Z')); // 65~90
		}
	}
