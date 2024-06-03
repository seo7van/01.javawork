package _04_interface;

/*
	interface
	- 상속 받을 때 키워드는 implements
	- 다중상속 가능 -> public class Audio implements RemoteControl, kkk, ooo
*/
public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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

}