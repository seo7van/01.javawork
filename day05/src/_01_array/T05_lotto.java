package _01_array;

import java.util.Arrays;

public class T05_lotto {

	public static void main(String[] args) {

		// p122
		
		// 1. 6개의 1차원 배열
		// 2. 1~45 숫자를 램덤으로 추출 
		// 3. 배열에 들어 있는 값과 랜덤 추출한 값이 같은가 비교
		// 3.1. 	같은 값이면 다시 랜덤 추출(2번으로 돌아감)
		// 3.2. 	다르면 배열에 넣기
		//4. 6개의 배열이 꽉 찰때까지 반복
		
		int lotto[] = new int[6];
		
		int index = 0;
		while(true) {
			int temp = (int)(Math.random()*45)+1;
			
			boolean insert = true;       //배열에 들어있는 값과 temp의 값이 다르면
			for(int i=0; i<=index; i++) {      //왜 index로 조건 설정?
				if(lotto[i] == temp) {
					insert = false;     //배열에 들어있는 값과 temp의 값이 같으면
					break;
				}
			}
			if(insert) {      //insert가 true이면 lotto배열에 temp의 값을 넣기
				lotto[index] = temp;
				index++;
			}
			if(index == 6) {  //배열이 6개가 꽉 차면 while문 빠져나옴.
				break;
			}
			System.out.println(Arrays.toString(lotto));
		}
			
	}

}