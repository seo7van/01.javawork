package _08_polumorphismArrayList;

public class ProductRun {
	
	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		GameDevice game = new GameDevice();
		
		b.buy(tv);
		b.buy(com);
		b.buy(game);
		b.info();
		
		b.buy(tv);
		
		b.refund(tv);
		b.info();

	}

}