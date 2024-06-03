package _03_overriding;

class Over {
	       void show (String str) {
	    	   System.out.println("부모클래스 메소드 : " + str);
	    	   }
	       }

class OverChild extends Over {
	void show (String abd) {			//오버라이딩 변수 이름은 상관없음
		System.out.println("자식 클래스 메소드 : " +abd);
	}
}

public class OverridingRun {
	public static void main(String[] args) {
		
		OverChild oChild = new OverChild();
		oChild.show("자바 프로그램");
		
		Over over = new Over();
		over.show("오라클");

	}
}