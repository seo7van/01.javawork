package _04_car;

import java.util.Scanner;

public class T01_main_car {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  //System.in 매개변수
		
		T01_api_car car = new T01_api_car();
		
		System.out.println("회사명 : " + car.company);
		System.out.println("모델 : " + car.model);
		System.out.println("색상 : " + car.color);
		
		while(true) {
			System.out.print("\n차 색상을 변경하시겠습니까?(yes/no): ");
			String A = scan.next();
			if(A.equals("yes")) {
				car.color();
				System.out.println("변경된 차 색상 : " + car.color);
				break;
			}
			else if(A.equals("no")) {
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		
		System.out.println();
		
		car.power();
		
		F: for(int i=0; i<5; i++) {
			System.out.print("\n속도(up/down): ");
			String S = scan.next();
			
			if(S.equals("up")) {
				System.out.println("현재 속도 : " + car.speedUp());
			}
			else if(S.equals("down")){
				if(car.speed <= 0) {
					System.out.println("더 이상 속도를 줄일 수 없습니다.");
					if(i != 0) {
						i--;
					}
					continue F;
				}
				System.out.println("현재 속도 : " + car.speedDown());
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				if(i != 0) {
					i--;
				}
				continue F;
			}
		}
		
		System.out.println();
		car.power();
		
		scan.close();
	}
		 
}