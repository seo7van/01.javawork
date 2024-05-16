package _01_casting;

public class T02_casting {

	public static void main(String[] args) {
		System.out.println("byte 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("char 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		System.out.println("------------------------------------------");
		
//		강제형변환
		int num1 = 12345;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
//		자동형변환
		long long1 = 11111111111123456L; //뒤에 L붙혀줘야 함
		float float1 = long1; 
		System.out.println(float1);
		
//		강제형변환
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
	}

}
