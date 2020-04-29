package SSD;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	public static void main(String[] args) {
		FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getName()+"///我的线程名字是");
				String name = Thread.currentThread().getName();
				return "线程执行成功啦";
			}
		});
		Thread t1 = new Thread(futureTask,"第一个线程");
		t1.start();
		try {
			System.out.println(futureTask.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	class tpp <T>{
		
	}
}
