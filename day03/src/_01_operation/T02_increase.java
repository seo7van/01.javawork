package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
//		++ 1증가 ++가 앞에 붙냐 뒤에 붙냐로써 먼저 계산하냐 할거다 하고 계산하냐 갈림
		int num1 = 10;
		num1 = num1 + 1;
		num1 += 1;
		num1 ++; //가장 많이 사용. 코드가 짧기 때문
		
		num1 = 10;
		num1 -- ;
		System.out.println(num1);
		
/*   단항연산자일때는 연산자가 앞이나 뒤나 결과 똑같
		이항연산자일때는 연산자의 위치에 따라 결과가 달라짐*/
		++num1;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
//		이항연산자가 앞에 먼저 오는경우 먼저 계산이 됨
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + ++num3;
		System.out.println(result);
		
//	    -> num2 +1 증가, num3와 계산 됨 -> result 에는 21입력. 계산 후에 num3 +1증가
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++; 
		System.out.println(result);
		
//		무조건 이항연산자 먼저 계산 nam1 + num2 - num3 이렇게 생각하자 과일바구니 !
		num1 = 10;
		num2 = 10;
		num3 = 10;
		result = ++num1 + --num2 - num3--;
		System.out.println(result);
		System.out.println(num3);
		
		num2 = 10;
		num3 = 10;
		int num4 = 10; 
		result = ++num2 + num3-- - num4++;  
		System.out.println(result);
		}
	}
