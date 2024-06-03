package _06_polymorphismEx;

public class Buyer {
	
	int money = 500;
	int bonusPoint;

	/*	
	void buy(Computer com) {
	}
	void buy(Tv tv) {	
	}
	void buy(GameDevice game) {
	}
	*/	
	void buy(Product p) {           //제품이 58000개 있어도 부모클래스만 넣어주면 자식클래스는 다 가지고 올 수 있음
		if(money < p.price) {
			System.out.println("잔액부족");
			return;            // return을 나를 호출한 곳으로 되돌아감. 완전히 빠져나감.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}


}