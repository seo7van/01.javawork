package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookArrayRun {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Book[] books = new Book[3];

		for(int i=0; i<books.length; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.print("책 제목을 입력하세요 : ");
			String thitle = scan.nextLine();	
			
			System.out.print("책의 저자을 입력하세요 : ");
			String author = scan.nextLine();	
			
			System.out.print("책값을 입력하세요 : ");
			int price = scan.nextInt();
			scan.nextLine();
			
			System.out.print("출판사를 입력하세요 : ");
			String publisher = scan.nextLine();
			
			books[i] = new Book(thitle, author, price, publisher);	
			
			System.out.println();
		}
		
		// 도서목록 조회
		/*	
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].informaion());
		}
		*/		
		// 향상된 for문
		for(Book book : books) {
			System.out.println(book.informaion());
		}
		System.out.println();
		
		//도서 제목을 검색하는 서비스
		System.out.print("\n검색할 책 제목 : ");
		String search = scan.next();
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {    //title은 private기 때문에 getTitle호출.
				System.out.println(books[i].informaion());
			}
		}
		
		scan.close();
	}
}