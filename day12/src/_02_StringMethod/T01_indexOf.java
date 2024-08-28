package _02_StringMethod;

public class T01_indexOf {

	public static void main(String[] args) {

		// indexOf : 문자열이 시작되는 index번호 반환
		String str = "java program";
		int index = str.indexOf("program");
		System.out.println(index);
		
		index = str.indexOf("abc");
		System.out.println(index);
		//-1 출력시 없는 문자
		
		if(str.indexOf("java") < 0) {
			System.out.println("자바 프로그램이 아닙니다.");
		}
		else {
			System.out.println("자바 프로그램이 입니다.");
		}
		
	}

}