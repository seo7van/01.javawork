package _Book;

import java.util.*;

public class BookController {
	
	ArrayList<Book> list = new ArrayList<Book>();
	
//	생성자 list에 Book 객체 4개 넣기
	BookController() {
		list.add(new Book("집에 가고 싶다 ", "최서진", "나는 누구", 10000));
		list.add(new Book("진짜 자고 싶다 ", "최서딘 ", "여긴 어디", 20000));
		list.add(new Book("산체는 기여워 ", "성산체 ", "학원 이지", 30000));
		list.add(new Book("산체 보고 싶다 ", "배고파", "광진구", 40000));
	}
	
//	insertBook( ) : list맨 뒤에 넣기
	void insertBook(Book b) {
		list.add(b);
	}
	
//	listAll() : 리스트 목록 모두 보여주기
	ArrayList<Book> listAll() {
		return list;
	}
	
//	searchBook(title) : 책 검색하여 객체 리턴 (검색하고 한권만 반환)
	Book searchTitle(String title) {
		/*
		Book book = null;
		
		if(list.isEmpty()) {    // (book == null)
			System.out.println("책이 존재하지 않습니다.");
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { 
				book = list.get(i);
				System.out.println(list.get(i));
				break;                 
			}
			else {
				System.out.println("찾는 책이 존재하지 않습니다.");
				break;
			}	
		}
		return book;      //여러 권이 검색되면 ArrayList<Book>으로 반환해줘야 함
		*/
		for(Book book : list) {
			if(book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}
	// 여러권 반환
	ArrayList<Book> searchBook(String title){
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book book : list) {
			if(book.getTitle().contains(title)) {
				searchList.add(book);
			}
		}
		return searchList;
	}
	
	// 책 제목과 저자가 맞으면 list에서 삭제. 삭제한 객체 리턴
	Book deleteBook(String title, String author) {
		
		Book removeBook = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getTitle().equals(author)) { 
				removeBook = list.get(i);
				System.out.println(list.get(i) + "을 삭제합니다.");
				list.remove(i);
				break;                 
			}
			else {
				System.out.println("찾는 책이 존재하지 않습니다.");
				break;
			}
		}
		return removeBook;
		
	}
	
	// 오름차순 정렬
	int ascBook(){
		list.sort(null);    // String클래스 sort()메소드는 compareTo가 호출됨
		return 1;
	}
}