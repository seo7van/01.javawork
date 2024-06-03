package _04_interface;

public class Tv implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 음량 : " + this.volume);
	}
	
	@Override
	public void search(String msg) {    //오버라이딩하려면 접근제어자가 같거나 커야 함
		System.out.println("나중에 추가한 메소드" + msg);
	}
	// static은 오버라이딩을 할 수 없음
	public void info() {
		System.out.println("static() 메소드");
	}

}