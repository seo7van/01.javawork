package _06_Book;

public class Book {

	private String title;
	private String author;
	private String publisher;
	
	//기본생성자
	Book() { }
	
	// 매개변수 3개 생성자
	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	//제목 삽입
	void setTitle(String title) {
		this.title = title;
	}
	//제목 호출
	String getTitle() {
		return title;
	}
	
	//작가 삽입
	void setAuthor(String author) {
		this.author = author;
	}
	//작가 호출
	String getAuthor() {
		return author;
	}
	
	//출판사 삽입
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	//출판사 호출
	String getPublisher() {
		return publisher;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + " 저자 : " + author + " 출판사 : " + publisher;
	}
	
}