package ibm.com.thread.communication;

public class EatTask implements Runnable{
	private Eat eat;
	public EatTask(Eat eat) {
		super();
		this.eat = eat;
		}
	public void run() {
		eat.doEat();//调用吃饭类方法
		}
}
