package _Book;

import java.util.Objects;

public class Book implements Comparable<Book>{

	private String title; //title(String)
	private String author; 		//author(String)
	private String category;		//category(String) - 장르
	private int price;		// int price(int)
	
//	기본생성자
	Book() {}
	
//	모든필드가 포함된 생성자 (	Source들어가서 누르면 이렇게 나옴)
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		}

		//	제목 호출
		public String getTitle() {
			return title;
		}
//		제목 삽입
		public void setTitle(String title) {
			this.title = title;
		}
//		작가 호출
		public String getAuthor() {
			return author;
		}
		
//		작가 삽입
		public void setAuthor(String author) {
			this.author = author;
		}
		
//		장르 호출
		public String getCategory() {
			return category;
		}
		
//		장르 삽입
		public void setCategory(String category) {
			this.category = category;
		}
		
//		가격 호출
		public int getPrice() {
			return price;
		}
		
//		가격 삽입
		public void setPrice(int price) {
			this.price = price;
		}
		
//		오버라이딩
		public String toString() {
			return "제목 : " + title + "\t"+"\t"+ "저자 : " + author + "\t"+"\t"+ "장르 : " + category + "\t"+"\t" + "가격 : " + price;
		}

		public int hashCode() {
			return Objects.hash(author, category, price, title);
		}

		public boolean equals(Object obj) {		//여러개 반납!
			if (this == obj)
					return true;
			if (this == null)
					return false;
			if (getClass() != obj.getClass())
					return false;
			Book other = (Book) obj;
			return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
					&& Objects.equals(title, other.title);
		}
			
/*			public boolean equals(Object obj) {		//1개 반납 ! 둘중 하나만 !
				Book other = (Book) obj;
				return price == other.price;
				}*/
			

		public int compareTo(Book b) {
			return title.compareTo(b.title);
		}
}