package _03_Scanner;

import java. util.Scanner; 
import java.util.concurrent.TimeUnit;
public class T02_Ex01 {

	public static void main(String[] args) {
//		 ex) 국어, 컴퓨터 수학 점수를 입력받아 저장하고 총점과 평균을 출력 하세요.
	       	    Scanner sc = new Scanner(System.in);
	       	    
	       	    System.out.println("국어 점수를 입력 하세요. : "); 
	       	    int korea = sc.nextInt();
	       	    
	       	    System.out.println("컴퓨터 점수를 입력 하세요. : ");
	       	    int com = sc.nextInt();
	       	    
	       	    System.out.println("수학 점수를 입력 하세요. : ");
	       	    int math = sc.nextInt();
	       	    
	       	    int sum = korea + com + math;
	       	    System.out.println("당신의 총점은 : "+ sum);
	       	    System.out.println("당신의 평균은 : "+ sum/3);
	       	    
	        	 try {for (int i = 0; i < 2; i++)
	        	 {TimeUnit.SECONDS.sleep(2);
	             System.out.println("당신의 성적이 만족 스럽다고 생각하나요 ?" + i);        } }
	       	     catch (Exception e) 
	        	 {System.out.println(e);
	        	 
             	 }}}
