package _02_car;

public class AmbulanceCar extends Car {
	
	boolean siren;
	
	AmbulanceCar() {   }
	
	AmbulanceCar(String model, String company) {
		super(model, company);
	}
	
	void siren() {
		this.siren = !siren;
		if(siren == true) {
			System.out.println("삐용삐용삐용 -!");
		}	
		else {
			System.out.println("사이렌을 멈춥니다.");
		}
	}
	/*
	void sirenOn() {
		System.out.println("삐용삐용삐용 -!");
	}
	void sirenOff() {
		System.out.println("사이렌을 멈춥니다.");
	}
	*/
	
	void firstaid () {
		System.out.println("응급처치를 실시합니다.");
	}
	
}