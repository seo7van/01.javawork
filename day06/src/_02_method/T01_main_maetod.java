package _02_method;

public class T01_main_maetod {

	public static void main(String[] args) {
		T01_api_method ob1 = new T01_api_method();
		ob1.print1();
		
//		반환형이 없는 메소드는 변수에 저장할 수도 없고, 출력할수도 없다.
		int result = ob1. print2(); //값 10이 들어옴
		System.out.println(result);
		System.out.println(ob1.print2());
			
		}
	}

}
