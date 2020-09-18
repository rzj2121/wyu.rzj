package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		MyRunnable myRunnable = new MyRunnable();
		for (int i = 0; i < 5; i++) {
            executorService.execute(myRunnable);
        }
		System.out.println("线程任务开始执行");
        executorService.shutdown();
	}
}
