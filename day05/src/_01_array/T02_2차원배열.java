package _01_array;

public class T02_2차원배열 {

	public static void main(String[] args) {

		//2차원 배열 : [행의 index][열의 index]
		int [][] score = {
						  {1, 2, 3, 4, 5},     //[0]
						  {6, 7, 8, 9, 10},    //[1]
						  {11,12,13,14,15} //[2]
						 //[0][1][2][3][4]
						  };
		
		System.out.println(score[0][2]);  //3
		System.out.println(score[2][3]);  //14
		
		System.out.println("행의 길이 : " + score.length);
		System.out.println("score[0]의 길이(열길이) : " + score[1].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		/*1, 3, 5, 7, 9
		11, 13, 15, 17, 19
		21, 23, 25, 27, 29*/
		int n = 1;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[0].length; j++) {
				score[i][j] = n;
				System.out.print(score[i][j] + "\t");
				n += 2;
			}
			System.out.println();	
		}
		
		int[][] iarr = {{1, 2, 3},
						{4, 5},
						{6, 7, 8, 9}};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {        //[i]!
				iarr[i][j] = n;
				System.out.print(iarr[i][j] + "\t");
				n += 2;
			}
			System.out.println();	
		}
		
		
		
	}	
}