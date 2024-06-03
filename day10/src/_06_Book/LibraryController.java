package _06_Book;

import java.util.ArrayList;

public class LibraryController {

	Member member;
	ArrayList<Book> bList = new ArrayList<Book>();
	
	LibraryController() {  }
	
	LibraryController(Member m){  //(String name, int age, String gender)  X
		member = m; 			 /* member.setName(name);
									member.setAge(age);
									member.setGender(gender);   틀림*/
	}
	
	//고객 정보
	void info() {
		System.out.println(member);    //member만 넣는 이유?
		//member.toString(); X
	}
	
	//리스트에 책 정보 삽입
	void insertBook() {
		bList.add(new Book("java", "서민구", "김앤북"));
		bList.add(new Book("spring", "강민구", "한빛미디어"));
		bList.add(new Book("html", "이민구", "길벗"));
	}
	/*ArrayList<Book> insertBook() {
		bList.add(new Book("java", "서민구", "김앤북"));
		bList.add(new Book("spring", "강민구", "한빛미디어"));
		bList.add(new Book("html", "이민구", "길벗"));
		return bList;
	}   반환값을 받고 싶으면 위 같이 void에 ArrayList<Book> 넣고 return 작성 */
	
	//오버로딩
	void insertBook(Book book) {
		bList.add(book);
	}
	
	//책목록 전체 호출
	ArrayList<Book> selectAll(){
		return bList;
	}
	
	//책 제목 찾기
	Book searchBook(String bookTitle) {
		Book book = null;
		
		if(bList.isEmpty()) {    // (book == null)
			System.out.println("책이 존재하지 않습니다.");
		}  //for문 밖에 있어도 되나?  for문 안에 있으면 break나 return을 사용해야함
		for(int i=0; i<bList.size(); i++) {   //향상된 for문 사용 가능
			if(bList.get(i).getTitle().equals(bookTitle)) {   //book.getTitle()  틀림.
		  //if(bookTitle.equals(bList.get(i).getTitle()))      위와 같은 기능 수행
				book = bList.get(i);
				System.out.println(bookTitle + " 책이 존재합니다.");
				break;                        //찾고 for문 빠져나옴
			}
			else {
				System.out.println("찾는 책이 존재하지 않습니다.");
				break;
			}	
		}
		return book;
	}
	
}