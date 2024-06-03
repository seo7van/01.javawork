package _01_array;

import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {

		//자리바꿈
		int num1 = 10;
		int num2 = 20;
		
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		//1차원 배열의 min값과 max값 가져오기
		int score[] = {8, 4, 9, 2, 6, 1, 3, 5, 6};
		
		int min = score[0];
		int max = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i]<min) {
				min = score[i];	
			}
			
			if(score[i]>max) {
				max = score[i];	
			}
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + max);
		
		//index번호 연산 가능
		int k=2;
		System.out.println(score[k]);
		System.out.println(score[k+5]);
		System.out.println(score[k*3]);
		System.out.println(score[k-1]);
		System.out.println(score[k/3]);       //나누기도 가능하지만 정수만 나와야 함. 몫만
		
		int arri[] = new int[10];
		for(int i=0; i<arri.length; i++) {
			arri[i] = (int)Math.random()*10;
		}
		
		for(int i=0; i<arri.length; i++) {
			System.out.print(arri[i] + ", ");
		}
		
		//Arrays클래스 라이브러리(API) 이용한 출력
		System.out.println(Arrays.toString(arri));
	}
}