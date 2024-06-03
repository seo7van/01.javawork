package _04_document;

class Product {

	String serialNo;
	static int c;
	static int nc;
	
	Product(){
		System.out.println("시리얼 번호 : 더조은 " + ++c);
	}
	
	Product(String serialNo){
		this.serialNo = serialNo;
		System.out.println("시리얼 번호 : " + this.serialNo + " " + ++nc);	
	}
	
}

public class T02_main_Product {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product("학원");
		Product p4 = new Product();
		
		System.out.println();
		System.out.println("생산된 제춤의 총 갯수 : " + (Product.c + Product.nc));
	}

}