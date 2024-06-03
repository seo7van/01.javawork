package _05_Thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		setName("myThread");    // Thread에게 상속 받았기 때문에 Thread.currentThread(). 사용하지 않아도 됨
		for(int i=0; i<500; i++) {    // 이름을 가져올 때는 getName 사용
			System.out.println(i);
		}
	}	
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		Thread.currentThread().setName("imple쓰레드");
		for(int i=1000; i<1500; i++) {
			System.out.println(i);
		}
	}	
}

public class T01_Thread {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread t2 = new Thread(new Thread2());
		t2.start();

	}

}