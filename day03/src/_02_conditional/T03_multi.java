package _02_conditional;

import java.util.Scanner;

public class T03_multi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score > 100) {
			System.out.println("잘못 입력 하였습니다.");
		}
		else if(score>=90) { //100~90
			System.out.println("A학점");
		}
		else if(score>=80) { //else 0~89. if 80이상. else if 범위 80~89
			System.out.println("B학점"); 
		}
		else if(score >= 70){ //else 0~79. if 70이상. else if 범위 70~79
			System.out.println("C학점");
		}
		else if(score >= 60) {
			System.out.println("D학점");
		}
		else if(score > 0) {
			System.out.println("F학점");		
		}
		else {
			System.out.println("잘못 입력 하였습니다.");			
		}
		
//		...103,102,101   -1,-2,-3...
		if(score > 100 || score < 0) {
			System.out.println("잘못 입력 하였 습니다.");			
		}
		else if(score >= 90) { 
			System.out.println("A학점");
		}
		else if(score >= 80) {    
			System.out.println("B학점");
		}
		else if(score >= 70){                
			System.out.println("C학점");
		}
		else if(score >= 60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");		
		}
		sc.close();
		}
	}
