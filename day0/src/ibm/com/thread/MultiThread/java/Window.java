package ibm.com.thread.MultiThread.java;

public class Window extends Thread {
//	static int ticket=10;
	int ticket=10;
	public void run() {
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"ÊÛÆ±£¬Æ±ºÅÎª£º"+ticket--);
			}else {
				break;
			}
		}
	}

}
