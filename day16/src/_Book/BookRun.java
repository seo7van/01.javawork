package _Book;

import java.util.*;

public class BookRun {
	
	static BookController bc = new BookController();  // 클래스 변수
													  // static(X) - 인스턴스 변수(객체 생성해야만 사용 가능)

	public static void main(String[] args) {

//		사용자로부터 입력받아 해당하는 서비스 하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서명 오름차순 정렬");
		System.out.println("6. 종료");
			
		while(true) {
			System.out.print("메뉴 선택 : ");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
			case 1:
				insertBook();  
				break;
				
			case 2:
				listAll();
				break;
				
			case 3:
				searchBook();
				break;
				
			case 4:
				deleteBook();
				break;
				
			case 5:
				ascBook();
				break;
				
			case 9:
				System.out.println("프로그램을 종료 합니다.");
				return;
				
			default :
				System.out.println("잘못 입력 하였습니다. 다시 입력 해주세요.");
			}	
		}
	}	
	
	static void insertBook() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======= new Book =======");
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("장르 (인문 / 동화 / 정치 / 개념서 /기타): ");
		String category = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(title, author, category, price));
	}
	
	// 목록 출력
	static void listAll() {
		
		System.out.println("\n======= BookList =======");
		ArrayList<Book> bookList = bc.listAll();
		
		if(bookList.isEmpty()) {
			System.out.println("도서가 하나도 없습니다");
		}
		else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}
	
	// 도서 검색
	static void searchBook() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n======= Sreach Book =======");
		System.out.print("검색할 도서 제목 입력 : ");
		String title = sc.nextLine();
		
//		글자가 들어가져 있으면 다 검색
		ArrayList<Book> searchList = bc.searchBook(title);
		if(searchList.isEmpty()) {
			System.out.println("\"" + title + "\"은(는) 존재하지 않습니다.");
		}
		else {
					for(Book book : searchList) {
							System.out.println(book);
			}
		}
		/*
		// 정확하게 title과 일치하는 것만 가져오기
		Book book = bc.searchTitle(title);
		if(book == null) {
			System.out.println("\"" + title + "\"은 존재하지 않습니다.");
		}
		else {
			System.out.println(book);
		}
		*/
	}
	
	// 도서 삭제
	static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n======= Delete Book =======");
		System.out.print("삭제할 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.nextLine();
		
		Book delBook = bc.deleteBook(title, author);
		
		if(delBook == null) {
			System.out.println("찾는 도서가 없어 삭제하지 못하였습니다.");
		}
		else {
			System.out.println(delBook.getTitle() +"을(를) 삭제하였습니다.");
		}
	}
	
	// 도서 정렬
	static void ascBook() {
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		}
		else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}