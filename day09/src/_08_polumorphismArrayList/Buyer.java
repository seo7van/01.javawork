package _08_polumorphismArrayList;

import java.util.ArrayList;

public class Buyer {
	
	int money = 500;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	
	int index = 0;
	void buy(Product p) {
		//System.out.println(p);
		// package Name.class Name@주소의 해시코드
		// _06_polymorphismEx.Tv@해시코드
		//오버라이딩을 하면
		//Tv
		
		if(money < p.price) {
			System.out.println("잔액부족");
			return;            // return을 나를 호출한 곳으로 되돌아감. 완전히 빠져나감.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);
		System.out.println(p + "를 구입함");
	}
	
	void info() {
		int sum = 0;
		String list = "";     //지역변수여서 초기화
		
		if(cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		for(int i=0; i<cart.size(); i++) {
			Product p1 = cart.get(i);
			sum += p1.price;
			list += p1 + ", ";
		}

		System.out.println("구입한 물품의 총액 : " + sum + "만원입니다.");
		System.out.println("구입한 물품의 목록 : " + list);
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품");
		}
		else {
			System.out.println("구입하지 않은 상품입니다.");
		}
	}


}