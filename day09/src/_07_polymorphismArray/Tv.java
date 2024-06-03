package _07_polymorphismArray;

public class Tv extends Product {
	
	Tv() {
		super(300);
	}
	@Override
	public String toString() {      //toString()은 Object에 들어있음. 그래서 앞에 public을 붙이지 않으면 오류.
		return "TV";
	}

}