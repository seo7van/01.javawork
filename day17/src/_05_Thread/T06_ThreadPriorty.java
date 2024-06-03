package _05_Thread;

class PThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.print("$");
			for(int j=0; j<1000000; j++);  // sleep과 같은 역할 수행
		}
		//System.out.println();
	}
}

class PThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.print("*");
			for(int j=0; j<1000000; j++);  // sleep과 같은 역할 수행
		}
		//System.out.println();
	}
}


public class T06_ThreadPriorty {

	public static void main(String[] args) {

		PThread pt1 = new PThread();
		PThread2 pt2 = new PThread2();
		
		pt2.setPriority(Thread.MAX_PRIORITY);   //MAX_PRIORITY = 10, MIN_PRIORITY = 1, NORM_PRIORITY = 5
		System.out.println("pt1의 우선순위 : " + pt1.getPriority());
		System.out.println("pt2의 우선순위 : " + pt2.getPriority());
		
		pt1.start();
		pt2.start();
		
	}

}