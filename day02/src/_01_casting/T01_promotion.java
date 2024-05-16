package _01_casting;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1;
		
		int int1 = b1;
		int1 = s1;
		
//		sysout + ctrl + 스페이스 바 : System.out.println();의 단축어		
		
		char ch1 = '최'; //겉으로 보기에는 문자, 하지만 정수형 ''홑따옴표로 감싸기
		int inch = ch1;
		System.out.println("'최'의 유니코드 : "+ inch);
		System.out.println(ch1);
		
		double d1 = int1;
		System.out.println(d1);
		d1 = s1+1;
		System.out.println(d1);
		d1 = b1+2;
		System.err.println(d1);
		
	}
}
