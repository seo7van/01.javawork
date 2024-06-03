package _02_car;

public class Car {
	
	String model;
	String company;
	boolean power;
	int speed;

	
	Car() {   }
	
	Car(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	void power() {
		this.power = !power;
		if(power == true) {
			System.out.println("차가 출발합니다.");
		}
		else {
			System.out.println("차가 멈춥니다.");
		}		
	}
	
	void speedUp() {
		speed += 30;               //this.speed
		System.out.println("현재 속도 : " + speed);
	}
	
	void speedDown() {
		speed -= 30;
		System.out.println("현재 속도 : " + speed);
	}
	/*	
	int speedUp() {
		speed += 10;
		return this.speed;
	}
	int speedDown() {
		speed -= 10;
		return this.speed;
	}
	*/
	
}