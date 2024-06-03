package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {

		// replace : 글자 치환
		String str = "javaprogram java awsjava dajava";
		String newStr = str.replace("j", "자바");
		
		System.out.println(str);
		System.out.println(newStr);
		
		str = "javaprogram jeava awsjava dajva";
		newStr = str.replace("java", "자바");  //중간에 단어가 빠지면 인식X
		System.out.println(newStr);
		
		newStr = str.replaceAll("a", "A");
		System.out.println(newStr);
		
	}

}