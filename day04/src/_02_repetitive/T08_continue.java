package _02_repetitive;

public class T08_continue {

	public static void main(String[] args) {

		/*    continue : 실행문을 실행하지 않고 다시 반복문을 실행
		 ~을 제외 할때 많이 사용, 해당 식을 건너 뜀*/
		
//		1~100까지 3의 배수를 제외한 합계 구하기
		int sum = 0;
		for(int i=1; i<=100; i++) {
				if(i%3 == 0) {
					continue;
			}
			sum += 1;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계 : " + sum);
		
//		같은 자료형 일 때
/*	 int num1 = 4;
		 int num2 = 9;
		 int num3 = 5;*/
		
		int num1, num2, num3;
/*	int num1 = 4, num2 = 9, num3 = 5;
		int num1 = 5, num2 = 5, num3 = 5;*/
		num1 = num2 = num3 = 5;			//같은 값으로 초기화 할 때 사용
		
		int num4, num5, num6;
		num4 = num5 = num6 = 5;
		
/*		for문 사용시 여러개의 변수 사용이 가능함
//		주의! 조건식은 반드시 하나만 들어가야 함*/		
		for(int i=1, j=20; i<=10; i++, j--) {		//조건식 사용할 때 주의 !
				System.out.println(i + "," + j);
		}
		
		for(int i=1, j=20, x=15, y=3; j>=10; i++, j--, x-=2, y+=5) {
				System.out.println(i + "," + j + "," + x + "," + y);
		}
		
//		while (true) 무한 반복과 동일
		for(;;) {
						System.out.println(num4);
						if(num4 == 8)
							break;
								num4 ++;
		}
//		중첩 for문에서 원하는 반복문을 빠져나오고 싶을 때
		forloop : for(int dan=2; dan<=9; dan++) {
						  for (int i=1; i<=9; i++) {
								System.out.println(dan + "*" + i + "=" + dan*i);
								if(i==5)
									break forloop;
						}
						  System.out.println();
		}
		
		for(int dan=2; dan<=9; dan++) {
				mid : for(int i=1; i<=9; i++) {
							for(int z=1; z<=5; z++) {
							System.out.println(dan + ", " + i + ", " + z);
							if(z==3)
							break mid;
							}
							System.out.println("mid for문 종료");
							}
				System.out.println();
				}
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		