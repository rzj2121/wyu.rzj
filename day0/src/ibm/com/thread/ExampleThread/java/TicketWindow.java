package ibm.com.thread.ExampleThread.java;

public class TicketWindow extends Thread{
	private static int tickets=100;//������static�������Ա�
	private static Object o=new Object();
	public void run(){
	// ͨ����ѭ����䣬��ӡ���
	while(true){
	synchronized (o) {
	if (tickets>0){
	// ��ȡ��ǰ�̵߳�����
		String th_name=Thread.currentThread().getName();
		
		System.out.println(th_name+"���ڷ��۵�"+tickets--+"��Ʊ");
	} 
	} 
	} 
	}
	
}