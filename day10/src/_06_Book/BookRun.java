package _06_Book;

import java.util.ArrayList;

public class BookRun {

	public static void main(String[] args) {

		LibraryController lc = new LibraryController(new Member("김수연", 23, "여"));
		
		//책 넣기
		lc.insertBook();
		
		//책 목록 출력
		System.out.println(lc.selectAll());
		
		//책 목록을 라인별로 출력하고 싶을 때
		ArrayList<Book> bList = lc.selectAll();
		for(int i=0; i<bList.size(); i++) {
			System.out.println(bList.get(i));
		}
		/* 향상된 for문
		for(Book book : bList) {
			System.out.println(book);
		}*/
		
		lc.insertBook(new Book("리액트", "이고잉", "위키북스"));
		System.out.println(lc.selectAll());
		
		//책 검색
		lc.searchBook("java");
		/*Book bookSe = lc.searchBook("java");
		if (bookSe == null) {
			System.out.println("찾는 책이 없습니다.");
		}
		else {
			System.out.println(bookSe);
		}*/
		lc.searchBook("JSP");
		
		

	}

}