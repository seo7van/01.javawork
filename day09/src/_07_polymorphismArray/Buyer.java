package _07_polymorphismArray;

public class Buyer {
	
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];
	
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
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	
	void info() {
		int sum = 0;
		String list = "";     //지역변수여서 초기화
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			sum += cart[i].price;
			list += cart[i] + ", ";
		}
		System.out.println("구입한 물품의 총액 : " + sum + "만원입니다.");
		System.out.println("구입한 물품의 목록 : " + list);
	}


}