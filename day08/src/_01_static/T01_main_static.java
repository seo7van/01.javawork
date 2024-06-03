package _01_static;

public class T01_main_static {
	
	int a;          // 인스턴스 필드
	static int b;   // 정적 필드.  클래스 변수는 자동 초기화가 되기 때문에 바로 출력 가능
	
	public static void main(String[] args) {
		
		int c;    // 지역변수. 출력 위해서는 초기화 필수
		//System.out.println(a);   인스턴스변수는 반드시 객체 생성해야지만 사용 가능
		//System.out.println(c);   지역변수를 초기화하지 않고 출력해서. 저장공간에 아무것도 들어있지 않음.
		
		// 클래스 변수, 클래스 메소드는 객체 생성을 하지 않아도 사용가능
		System.out.println(b);     // 이미 저장공간이 만들어져 있음
		System.out.println(T01_api_static.nameSt);
		System.out.println(T01_api_static.sMe4());
		System.out.println();
		
		// 인스턴스 변수, 인스턴스 메소드는 반드시 객체를 생성해야 사용가능
		T01_api_static s1 = new T01_api_static();
		System.out.println(s1.nameIn);
		System.out.println(s1.me2());
		// 객체에서도 클래스 변수, 클래스 메소드 사용가능
		System.out.println(s1.numSt);
		System.out.println(s1.sMe4());
		
	}
}