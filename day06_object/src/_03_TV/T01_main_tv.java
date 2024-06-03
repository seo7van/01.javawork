package _03_TV;

import java.util.Scanner;

public class T01_main_tv {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  //System.in 매개변수
		//Math.random();   //Math 클래스, random() 메소드
		
		T01_api_tv tv = new T01_api_tv();
		System.out.println("회사명 : " + tv.company);
		System.out.println("모델명 : " + tv.model);
		System.out.println(tv.inch + "인치");
		
		tv.power();            //power = true
		//System.out.println("tv 전원 : " + tv.power);
		
		System.out.println("현재 채널 : " + tv.channelUp());
		System.out.println("현재 채널 : " + tv.channelUp());
		System.out.println("현재 채널 : " + tv.channelDown());
		
		System.out.println("현재 음량 : " + tv.volume(scan.nextInt()));
		
		tv.power();               //주의!  메소드 호출
		//System.out.println("tv 전원 : " + tv.power);   //power은 변수 호출
	
		scan.close();
	}
		 
}