package _05_Thread;

public class T04_SingleThreadTime {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		for(int i=0; i<500; i++) {
			System.out.println("@");
		}
		System.out.println();
		System.out.println("소요시간 : " + (System.currentTimeMillis()-startTime));
		// 출력 : 4(milsec)
		
		for(int i=0; i<500; i++) {
			System.out.println("*");
		}
		System.out.println();
		System.out.println("총 소요시간 : " + (System.currentTimeMillis()-startTime));
		// 출력 : 22(milsec)
	
	
	}

}