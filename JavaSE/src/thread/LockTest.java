package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {
	
	public static int number = 100;
	Lock lok = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			// 必须在if语句前使用lock（）方法！！！
			lok.lock();
			if(number > 0) {
				try {
					Thread.currentThread();
					Thread.sleep(20);
					System.out.println(Thread.currentThread().getName() + " 正在买票，还剩下：" + (number - 1) + "张票");
					number--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					lok.unlock();
				}
			}
		}
	}

}