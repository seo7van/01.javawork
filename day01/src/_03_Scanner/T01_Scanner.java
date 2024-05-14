 package _03_Scanner;

import java.util.Scanner;

public class T01_Scanner {

    	 	public static void main(String[] args) {
//    	 		Scanner scan = new Scanner(System.in); 출력값에 입력하게 하는 명령어
    	 		Scanner scan = new Scanner(System.in);   
    	 		
    	 		
/*    	 	println = 출력했을때 줄바꿈
				print = 출력했을때 바로 옆에 공통점은 명령한 다음줄부터 해당*/
    	 		System.out.println("이름을 입력하세요 : "); 
    	 		String name = scan.next(); //문자열의 단어, 내가 입력
    	  	    System.out.println("당신의 이름은" + name);
    	 		
    	  	    
    	 		System.out.print("나이를 입력하세요 : ");
    	 		int age = scan.nextInt();
    	 		System.out.println("당신의 나이 : " + age);
    	 		
    	 		
    	 		System.out.println("키를 입력하세요 : ");
    	 		double key = scan.nextDouble(); //자료형에 따라 꼭 붙혀야 함
    	 		System.out.println("키 : " + key);
    	 		
    	 		
    	 		System.out.println("당신은 남자입니까 (true, false)? ");
    	 		boolean gender = scan.nextBoolean();
    	 		System.out.println("당신은 남자입니까?" + gender);
    	 		
    	 		
    	 		System.out.print("주소를 입력하세요 : ");
    			String address2 = scan.next();
    			System.out.println("주소 : " + address2);
    	 		
    			
    			System.out.print("당신의 성별은 무엇입니까? ");
    			//String gender2 = scan.next();
    			char gender3 = scan.next().charAt(2);
    			//System.out.println("성별 : " + gender2);
    			System.out.println("성별 :" + gender3);
    
	
	}

}
