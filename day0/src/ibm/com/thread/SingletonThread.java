package ibm.com.thread;

public class SingletonThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		t.setName("����");
		for(int i=0;i<10;i++) {
			System.out.println(t.getName()+"��Ʊ��Ʊ��Ϊ��"+i);
		}
	}

}
