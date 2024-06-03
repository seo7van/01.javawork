package _01_array;

public class T01_1차원배열 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
//		배열 [] : 배열 표시는 자료형 또는 변수명에 붙혀줌
		int [] arrayInt = new int[5];
		arrayInt[0] = 10;
		arrayInt[2] = 20;
		
		int arrayInt2[] = {1, 2, 3, 4, 5};
		char arrayChar[] = {'a', 'b', 'c'};
		String arrayString[] = {"홍길동", "호랑이"};
		double arraydouble[] = {35.46, 34.5, 7};
		
		int arrayInt3[] = new int[5];     //index번호 : 0~4
		//arrayInt3[5] = 9;                 //오류 : index의 범위를 넘어서 넣을 수 없음
		
		// 배열 100개를 만들어서 1~100까지의 값을 넣는다
		int[] arrayInt4 = new int[100];
		/*
		arrayInt4[0] = 1;
		arrayInt4[1] = 2;
		arrayInt4[2] = 3; ...
		*/
		
		for(int i=0; i<100; i++) {
			arrayInt4[i] = i+1;
			System.out.print(arrayInt4[i]);
			if(i != 99){
				System.out.print(", \n"); 
			}
		}
		
		
		
	}

}