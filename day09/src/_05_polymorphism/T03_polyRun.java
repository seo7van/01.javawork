package _05_polymorphism;

class Car {
	String color;
	int speed;
	void dirve() {
		System.out.println("운전중 빵빵!!!");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class Firetruck extends Car {
	void water() {
		System.out.println("물을 뿌립니다~~!");
	}
}

public class T03_polyRun {

	public static void main(String[] args) {

		Firetruck fTruck = new Firetruck();
		fTruck.dirve();
		fTruck.water();
		fTruck.stop();
		
		Car car = fTruck;
		car.dirve();		
		car.stop();
		//car.water();   사용불가

		Firetruck fTruck2 = (Firetruck)car;   // 부모타입 => 자식타입으로 강제형변환
		/*		
		* 주의 
		반드시 부모는 최초 객체 생성시 자식의 타입으로 객체 생성되어 있어야 됨.
		*/	
		
		Car car2 = new Car();
		
		// 컴파일 오류(실행시 오류가 발생)
		//Firetruck fTruck3 = (Firetruck)car2;
		
		// instanceof : 좌측의 객체가 우측의 타입으로 만들어졌느냐 검사(true)
		Firetruck fTruck3 = null;
		if(fTruck3 instanceof Firetruck) {
			fTruck3 = (Firetruck)car2;
		}
		else {
			System.out.println("변환할 수 없음");
		}
	}
	
}