package _02_car;

public class CarRun {
	
	public static void main(String[] args) {
		
		AmbulanceCar ambul = new AmbulanceCar("구급차", "현대");
		System.out.println("model명 : " + ambul.model);
		System.out.println("색상 : " + ambul.company);
		System.out.println();
		
		ambul.firstaid();
		ambul.power();
		ambul.siren();
		System.out.println();

		ambul.speedUp();
		ambul.speedUp();
		ambul.speedUp();
		ambul.speedDown();
		ambul.power();
		ambul.siren();
		System.out.println();
		
		Car car = new Car("jeep", "black");
		car.power();
		car.power();
		
	}

}