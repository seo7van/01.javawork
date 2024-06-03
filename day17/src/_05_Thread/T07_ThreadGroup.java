package _05_Thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {

		ThreadGroup groupName = Thread.currentThread().getThreadGroup();   //현재 돌아가는 thread가져옴
		
		System.out.println(groupName.getName());
		
		ThreadGroup group1 = new ThreadGroup("Group1");
		ThreadGroup group2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(group1, "SubGroup1");  // 넣고자 하는 그룹의 이름, 하위그룹 이름
		
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		// Thread(ThreadGroup tg, Runnable r, String name)
		Thread th1 = new Thread(group1, r, "th1");
		Thread th2 = new Thread(subGrp1, r, "th2");
		Thread th3 = new Thread(group2, r, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("List of ThreadGroup : " + groupName.getName());
		System.out.println("Active ThreadGroup : " + groupName.activeGroupCount());
		System.out.println("Active Thread : " + groupName.activeCount());
		groupName.list();
				
	}

}