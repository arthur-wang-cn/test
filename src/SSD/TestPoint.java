package SSD;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPoint implements Serializable{
	static int j=0;
	public void test(){
		this.j=1;
	}
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	/*Date date = new Date();
	date.setDate(27);
	date.setMonth(4);
	System.out.println(date);
	System.out.println("df");
	Date date2 = new Date(2019, 3, 19);
	System.out.println("date2:"+date2);
	int a=(int) (Math.random()*100);
	System.out.println(a);*/
	Integer a=127;
	Integer b=127;
	System.out.println(a==b);
	System.out.println(a);
	Integer c=128;
	Integer d=128;
	System.out.println(c);
	System.out.println(c==d);
	Thread t1 = new Thread();
	ExecutorService pool = Executors.newCachedThreadPool();
	pool.execute(new Runnable() {
		@Override
		public void run() {
			System.out.println("我是几把真");
		}
	});
	
	System.out.println();
}
}
