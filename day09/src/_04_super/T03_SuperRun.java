package _04_super;

class Parent3 {
	int  x;
	int y;
	Parent3() {
		System.out.println("부모생성자 호출");
		x = 10;
		y = 10;
	}
}

	class Child3 extends Parent3{
		int x = 20;
		int z = 10;
		Child3 () {
				System.out.println("자식 생성자 호출");
				x = 10*10;
				z = 10*10;
		}
	}
		
	class GrandChild extends Child3 {
		int x  ;
		GrandChild() {
				System.out.println("손자 생성자 호출");
				x = 10*10*10;
		}
	}
	public class T03_SuperRun {

		public static void main(String[] args) {
			
			GrandChild gchild = new GrandChild();
			System.out.println(gchild.x);
			// System.out.println(ghild.super.x);  super는 상속받은 곳에서만 사용
			System.out.println(gchild.y);
			System.out.println(gchild.z);         // 부모에게 상속 받기 위해서는 변수명을 다르게 설정해주면 됨.
		}
	}