package _05_Thread;

class MultiThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println("*");
		}
		System.out.println();
		System.out.println("Thread 소요시간 : " + (System.currentTimeMillis()-T05_MultiThreadTime.startTime));
		// 출력 : 7(milsec)   단일 쓰레드 사용시간의 약 1/3  => 효율적
	}
}
public class T05_MultiThreadTime {

	static long startTime = 0;
	
	public static void main(String[] args) {

		MultiThread mt = new MultiThread();
		mt.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++) {
			System.out.println("@");
		}
		System.out.println();
		System.out.println("main 소요시간 : " + (System.currentTimeMillis()-startTime));
		// 출력 : 5(milsec)
		
	}

}