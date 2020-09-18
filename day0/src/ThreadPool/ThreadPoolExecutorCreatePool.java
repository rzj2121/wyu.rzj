package ThreadPool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorCreatePool {
	public static void main(String args[]) {
		ThreadPoolExecutor threadPoolExecutor =  new ThreadPoolExecutor(5, 10, 10L, 
				TimeUnit.SECONDS,
				new LinkedBlockingDeque<>(1000),
				new ThreadPoolExecutor.AbortPolicy());
	}
}
