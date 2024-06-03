package _05_singleton;

// 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
//		   실행 클래스에서 객체를 만들지 못하도록 해야 함.
public class T01_api_singleton {

	// 객체를 생성하지 못하도록 막아 놓았음
	// 인스턴스 변수 => 정적 변수로 바꿔줌. 그래야 호출 가능.
	private static T01_api_singleton singleton = new T01_api_singleton();
	//static이 있든 없든 접 근할 수 없음.
	
	private T01_api_singleton(){
		System.out.println("객체 생성");
	}
	
	//인스턴스 메소드 => 정적 변수 바꾸어줌 그래야 호츨 가능
	static T01_api_singleton getSingleton() {
		return singleton;     //정적 메소드에서는 정적 필드만 사용가능. 그래서 변수 앞에 static을 붙어야 함.
	}
	
	
}