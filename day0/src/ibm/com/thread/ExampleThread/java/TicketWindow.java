package ibm.com.thread.ExampleThread.java;

public class TicketWindow extends Thread{
	private static int tickets=100;//变量用static修饰做对比
	private static Object o=new Object();
	public void run(){
	// 通过死循环语句，打印语句
	while(true){
	synchronized (o) {
	if (tickets>0){
	// 获取当前线程的名称
		String th_name=Thread.currentThread().getName();
		
		System.out.println(th_name+"正在发售第"+tickets--+"张票");
	} 
	} 
	} 
	}
	
}
