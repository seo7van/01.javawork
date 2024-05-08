package _01_casting;

public class T03_castingOp {

	public static void main(String[] args) {
//		int 형보다 작은 자료형의 연산은 모두 int로 자동 형변환 됨
		byte b1 = 10;
		byte b2 = 20;
		
//		byte result = b1 +b2; 오류 byte형 = int형
		int result = b1 + b2;
		byte result2 = (byte) (b1 + b2);
		
		char c1 = 'A';
//		char c2 = c1 + 1;
		int c3 = c1 + 1;
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
		System.out.println(c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;
		System.out.println(num1 + "/" + num2 + "의 몫 : " + result3);
		
		double dou2 = 3;
		double resulte4 = num1 / dou2;
		System.out.println(resulte4);
/*doble*/
	}

}
