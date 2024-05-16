package _01_obj;

public class T01_main_car {

	public static void main(String[] args) {
		T01_api_car car1 = new T01_api_car();
		
		car1.power();
		int speed = car1.speed(100);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 속도 : " + car1.speed(100));
		
		speed = car1.speedDown();
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 속도 : " + car1.speedDown());
		
		car1.color = "검정색";
		System.out.println(car1.color);
		
		String car1Color = car1.color;
		System.out.println(car1Color);
		System.out.println("------------------------------------------------");
		
		
		
		

	}

}
