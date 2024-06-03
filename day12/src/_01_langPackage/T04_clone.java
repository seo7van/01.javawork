package _01_langPackage;

class Point implements Cloneable {
	int x;
	int y;
	
	Point(){
		
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	@Override
	// 반환값으로 뭐가 들어올지 모르기 때문에 가장 최상위 클래스가 Object을 사용
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();    //1. 부모 호출. clone은 objcet에 있음
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;        //2. 리턴
	}
}

public class T04_clone {

	public static void main(String[] args) {

		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();  //부모 객체로 형변환
		//copy를 사용하지 않으면 Point 객체를 하나 더 만들어야 됨.
		Point p1 = new Point();
		
		System.out.println(original);
		System.out.println(copy);
		System.out.println(p1);
		
		p1.x = 10;
		p1.y = 20;
		
		copy = (Point)p1.clone();
		System.out.println(p1);
		
	}
	
}