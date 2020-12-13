package thread;


public class synchronizedRunnable implements Runnable{
	
	public static int number = 100;
	// 创建锁对象
	Object ob = new Object();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 同步代码块关键词synchronized 添加一个锁对象ob
		synchronized(ob) {
			while(true) {
				if(number > 0) {
					try {
						Thread.currentThread();
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " 正在买票，还剩下：" + (number - 1) + "张票");
					number--;
				}
			}
		}
	}

}
