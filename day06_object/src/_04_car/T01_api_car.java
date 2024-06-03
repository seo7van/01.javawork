package _04_car;

public class T01_api_car {

	String company = "Jeep";
	String model = "Wrangler";
	String color = "Black";
	int speed;         
	boolean power;     
	
	//시동
	void power() {        // 반환값 없음
		power = !power;
		if(power) {
			System.out.println("시동을 켭니다.");
		}
		else {
			System.out.println("시동을 끕니다.");
		}
	}
	
	//속도
	int speedUp() {          //지역변수
		speed += 10;
		return speed;
	}
	
	int speedDown() {          //지역변수
		speed -= 10;
		return speed;
	}
	
	//컬러
	String color() {
		int a = (int)(Math.random() * 4);
		String colorc[] = {"White", "Yellow", "Red", "Green"};
		color = colorc[a];
		return color;
	}
}