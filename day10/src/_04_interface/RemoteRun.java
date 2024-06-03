package _04_interface;

abstract public class RemoteRun {
	
	public static void main(String[] args) {
		
		// 인터페이스는 객체 생성할 수 없다
		// 그러나 형변환은 가능
		
		// RemoteControl rc1 = new RemoteControl();   사용불가
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		System.out.println();
		
		RemoteControl rc = audio1;
		rc.turnOn();
		System.out.println();
		
		rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		
	}

}