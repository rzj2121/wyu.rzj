package ibm.com.thread.communication;

public class WcTask implements Runnable {
	private Wc wc;

	public WcTask(Wc wc) {
		super();
		this.wc = wc;
	}

	public void run() {
		wc.paidui();// 调用Wc类的任务方法
	}
}
