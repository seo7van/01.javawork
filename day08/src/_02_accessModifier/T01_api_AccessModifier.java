package _02_accessModifier;

public class T01_api_AccessModifier {

	private int priNum = 5;
	
	/*private void method() {           // 객체 생성했지만 접근할 수 없음
		System.out.println("private 메소드");
	}*/
	
	void setPriNum(int priNum) {
		this.priNum = priNum;
	}
	
	int getPriNum() {
		return priNum;
	}
	
}