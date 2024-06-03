package _02_wrapperClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-234-5678";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// 이메일체크
		/*
		문자나 숫자  1개 이상  @  문자나 숫자 . 문자
		문자나 숫자  1개 이상  @  문자나 숫자 . 문자 . 문자
		
		sample123@naver.com
		sample123@google.com
		sample123@google.or.kr
		*/
		
		// 이메일 체크
		regExp = "^[a-zA-Z]\\w+@\\w+.\\w+(\\.\\w+)";  
		data = "angle@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
	}

}