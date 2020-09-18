package ibm.com.thread.communication;

import java.util.concurrent.Semaphore;

public class Wc {
	private Semaphore semaphore = new Semaphore(3);

	public void paidui() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " :正在使用厕所");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " :使用厕所完毕");
		semaphore.release();
	}
}
