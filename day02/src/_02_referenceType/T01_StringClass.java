package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		
		String name = "최서진";
		String hobby = "공부하기"; //객체 따로 생성
		
		System.out.println("주소가 같은가 ?" + (name == hobby));
		
		String str1 = "의료용";
		String str2 = "의료용";
		
//		괄호()가 없으면 같다==라고 인식하지 않고 연산기호로 인식하거나 따로 인식한다.
		System.out.println("주소가 같은가?"+ (str1 == str2 )); 
		
		String myName = "최서진";
		System.out.println("주소가 같은가?" + (name == myName));
		
//		new 를 사용하여 각각 객체를 생성함
		String str3 = new String("영상");
		String str4 = new String("영상");
		System.out.println("주소가 같은가?" + (str3 + str4));
		
//		equals : 같이 같은지 틀린지에 대한 단축키(?) 위에것들이랑 같음
		System.out.println("값이 같은가?" + str3.equals(str4)); 
		}
	}
