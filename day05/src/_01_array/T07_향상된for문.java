package _01_array;

import java.util.Arrays;

public class T07_향상된for문 {

	public static void main(String[] args) {

		// 향상된 for문 배열에서만 사용가능
		// 무조건!! 배열을 처음부터 끝까지 사용할 때
		int num[] = {1, 2, 3, 4, 5};
		
		for(int result: num) {
			System.out.println(result);
		}
		
		// 배열의 단점 : 배열의 크기 넣을 값보다 크면 메모리 낭비
		//             배열의 크기가 적을 경우 나중에 늘릴 수 없음.
		
		//배열의 크기가 작을 경우 copy하여 만들어야 함
		int oldScore[] = {98, 67, 45, 100, 90};
		int newScore[] = new int[10];
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i];
		}
		newScore[5] = 57;
		System.out.println(Arrays.toString(newScore));
		
		//라이브러리(API) : arraycopy(복사할 배열, 복사할 index번호, 새배열, 새배열의 index번호(부터넣기), 갯수)
		System.arraycopy(oldScore, 0, newScore, 0, 0);	
		System.out.println(Arrays.toString(newScore));
		
		// 3개를 넣을 수 있는 문자열 배열 만들어거 값 넣기
		// 10개짜리 배열을 만들어서 복사하여 넣기 (inndex 5번부터 2개만 넣기)
		String arrS[] = {"히", "하", "호"};
		String arrS2[] = new String[10];
		
		System.arraycopy(arrS, 0, arrS2, 5, 2);
		System.out.println(Arrays.toString(arrS2));
		
		
		
		// 라이브러리 사용
		System.arraycopy(arrS, 0, arrS2, 5, 2);
		
		// for문 사용
		for(int i=0; i<arrS.length-1; i++) {
			arrS[i+5] = arrS2[i];
		}
	
		// 향상된 for문 사용
		int index = 5;
		for(String str : arrS) {               //무조건 값을 다 넣어야 함
			arrS2[index++] = str;
		}
		System.out.println(Arrays.toString(arrS2));
	}

}