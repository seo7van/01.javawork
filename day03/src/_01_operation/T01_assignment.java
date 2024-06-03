package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {//  '%'(몫의 기호), '_' 긴 숫자 보기 쉽게 컴마 기호
//		% : 값을 나눈 나머지란 뜻 (몫)
		int num1 = 10;
		int num2 = 3;
		int result = num1 % num2;
		
		System.out.println("몫 : " + num1 / num2 );
		System.out.println("나머지 : "+ result);
		
		num1 = num1 + 10;
		System.out.println(num1);
		
		num1 += 10; // num1 + 10 = 20 + 10 => num1
		System.out.println(num1);

		num1 += 5; // num1 = 35
		System.out.println(num1);

		num1 -= 8; // 35-8=27
		System.out.println(num1);
		
		num1 -= 17; // 27-17=10
		System.out.println(num1);
		
		num1 *= 3; // 10*3=30
		System.out.println(num1);
		
		num1 /= 3; // 30/3=10
		System.out.println(num1);
		
		num1 %= 4; // 10%4= 10을 4로 나누고 남은 몫의 값이니까 2
		System.out.println(num1);

/*	_언더바는 컴퓨터는 숫자로 인식함 
		마치 100단위 숫자 ,랑 같음 300,000,000 이거랑 같음 
		사람이 보기 편하도록 함*/
		int num3 = 300_000_000;
		System.out.println(num3);
		}
	}
