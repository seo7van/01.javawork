package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		
		for(int i=1;i<=3; i++)	{
				for(int j=1; j<=5; j++) {//for문에 if로 초기화 할 수 없음 밖 for문에서 선언했기 때문에 안 for문에서 같은 이름으로 선언하려고 하면 오류
						System.out.println("i=" + i + ", j=" + j);
							}
		}
		System.out.println();
		
//		구구단
		for(int i=2; i<=9; i++){
				System.out.printf("\n***%s단 ***\n", i);
					for(int j=1; j<=9; j++) {
						System.out.println(i + "x" + j + "=" + i*j);
						}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n숫자를 입력 하세요 : ");
		int n = sc.nextInt();
		
		char s = '*';
		for(int i=1; i<=n; i++) {			//++단항이어서 전위, 후위 상관없음?
				String w= "";							//w의 위치 중요함. for문의 밖으로 나가면 안for문이 돈 뒤에 초기화가 되지 않아서 오류
				for(int j=1; j<=i; j++) {
				w+=s;
				}
				System.out.println(w);
		}
		
		for(int i=1; i<n; i++) {
				for(int j=1; j<=i; j++) {
						System.out.println(s);
			}
						System.out.println();
		}
		
		for(int i=2; i<=9; i++) {
				System.out.printf("*** %s단  ***\t", i);
				}
				System.out.println();
						
		for(int i=1; i<=9; i++) {
				for(int j=2; j<=9; j++) {
						System.out.print(j + "x" + i + "=" + i*j + "\t");
						System.out.printf("%d x %d = %2d\t", j, i, i*j);
				}
				System.out.println();
				}	
		sc.close();	
	}
}
