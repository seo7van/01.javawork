package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookRun {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
				// 1. 기본생성자로 객체를 생성해서 getter/stter메소드로 값 초기화
				Book book = new Book();
				book.setTitle("JAVA");
				book.setAuthor("김지원");
				book.setPrice(35000);
				book.setPublisher("theun");
				System.out.println(book.informaion());
				
				// 초기화 방법 2. 매개변수가 있는 생성자 이용
				Book book1 = new Book("Python", "서민구", 30000, "김앤북");
				System.out.println(book1.informaion());
				
				// 사용자로 부터 값을 입력 받아 초기화 하여 출력하기
				Book book3 = new Book();
				
				System.out.print("책 제목을 입력하세요 : ");
				String thitle = scan.next();	
				book3.setTitle(scan.next());
				
				System.out.print("책의 저자을 입력하세요 : ");
				String author = scan.next();	
				book3.setAuthor(scan.next());
				
				System.out.print("책값을 입력하세요 : ");
				int price = scan.nextInt();
				book3.setPrice(scan.nextInt());
				
				System.out.print("출판사를 입력하세요 : ");
				String publisher = scan.next();
				book3.setPublisher(scan.next());
				
				Book book2 = new Book(thitle, author, price, publisher);
				
				System.out.println(book2.informaion());
				System.out.println(book3.informaion());
		*/	
		// 관리 해야 되는데 일반 변수 사용
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		
		for(int i=0; i<3; i++) {
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
			
			if(i == 0) {
				book1 = new Book(thitle, author, price, publisher);		
			}
			else if (i == 1) {
				book2 = new Book(thitle, author, price, publisher);			
			}
			else {
				book3 = new Book(thitle, author, price, publisher);		
			}	
			
			System.out.println();
		}
		
		System.out.println(book1.informaion());
		System.out.println(book2.informaion());
		System.out.println(book3.informaion());
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("\n검색할 책 제목 : ");
		String search = scan.next();
		
		if(book1.getTitle().equals(search)) {
			System.out.println(book1.informaion());
		}
		if(book2.getTitle().equals(search)) {
			System.out.println(book2.informaion());
		}
		if(book3.getTitle().equals(search)) {
			System.out.println(book3.informaion());
		}
		
		if(!book1.getTitle().equals(search) && !book2.getTitle().equals(search) && !book3.getTitle().equals(search)) {
			System.out.println("존재하지 않는 책입니다.");
		}
		
		scan.close();

	}
	
}