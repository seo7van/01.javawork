package _01_Object;

public class T01_main_class {

public static void main(String[] args) {
		T01_api_class ob1 = new T01_api_class(); //라이브러리명 적기
		int result = ob1.num;
		System.out.println(result);
		System.out.println(ob1.num);
		
		System.out.println(ob1.name);
		ob1.name = "최서진";
		System.out.println(ob1.name);
		
		T02_class ob2 = new T02_class(); //라이브러리명 적기
		System.out.println(ob2.age + "세");
		System.out.println("주소 : " + ob2. address);
		
	}
}
