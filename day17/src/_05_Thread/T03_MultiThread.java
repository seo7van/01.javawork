package _05_Thread;

import java.awt.Toolkit;

class BeepThread extends Thread {
	@Override
	public void run() {
		for(int i=10; i<15; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);   
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
		}
	}
}

public class T03_MultiThread {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();  // 윈도우 안에 들어있는 소리
		BeepThread bt = new BeepThread();
		bt.start();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println(i);
			
			try {
				Thread.sleep(1000);   //500 = 0.5초  1000 = 1초	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
		}
		
		// 동시 출력처럼 보이지만 약 0.0000001초 차이로 먼저 실행되는 것
	}

}