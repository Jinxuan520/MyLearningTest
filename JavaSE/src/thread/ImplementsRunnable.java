package thread;

public class ImplementsRunnable implements Runnable{
	
	public static int number = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(number > 0) {
				try {
					Thread.currentThread().sleep(200);
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
