package _06_polymorphismEx;

public class GameDevice extends Product {
	
	GameDevice() {
		super(80);
	}
	@Override
	public String toString() {      //toString()은 Object에 들어있음. 그래서 앞에 public을 붙이지 않으면 오류.
		return "GameDevice";
	}

}