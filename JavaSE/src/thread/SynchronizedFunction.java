package thread;

public class SynchronizedFunction implements Runnable{
	
	public static int number = 100;
	// 创建锁对象
	Object ob = new Object();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 同步代码块关键词synchronized 添加一个锁对象ob
//		synchronized(ob) {
//			while(true) {
//				if(number > 0) {
//					try {
//						Thread.currentThread();
//						Thread.sleep(200);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + " 正在买票，还剩下：" + (number - 1) + "张票");
//					number--;
//				}
//			}
//		}
		payTickets();
	}
	
	public /*synchronized*/ void payTickets() {
		// 在方法中使用同步代码块也是可以的, 同样也可以达到目的
		synchronized(this) {
			while(true) {
				if(number > 0) {
					try {
						Thread.currentThread();
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " 正在买票，还剩下：" + (number - 1) + "张票");
					number--;
				}
			}
		}
//		while(true) {
//			if(number > 0) {
//				try {
//					Thread.currentThread();
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName() + " 正在买票，还剩下：" + (number - 1) + "张票");
//				number--;
//			}
//		}
	}

}
