package _03_TV;

public class T01_api_tv {

	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 65;
	int volume;         // 기본값 0    //객체변수
	int channel = 1;
	boolean power;      // 기본값 flase
	
	//전원
	void power() {        // 반환값 없음
		power = !power;
		if(power) {
			System.out.println("tv를 켭니다.");
		}
		else {
			System.out.println("tv를 끕니다.");
		}
	}
	
	//음량
	int volume(int volumInput) {          //지역변수
		volume = volumInput;
		return volume;
	}
	
	//채널변경
	int channelUp() {
		channel++;
		return channel;
	}

	int channelDown() {
		channel--;
		return channel;
	}

}