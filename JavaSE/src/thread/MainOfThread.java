package thread;

public class MainOfThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread01 thread01 = new ExtendThread01();
		ExtendThread01 thread02 = new ExtendThread01();
		thread01.setName("th_01: ");
		thread02.setName("th_02: ");
		
		// 不会与main线程抢夺执行权
//		thread01.run();
//		thread02.run();
		
		// 会与main线程抢夺执行权
		thread01.start();
		thread02.start();
		
		// 主线程的动作
		for(int j=0; j<20; j++) {
			// 链式编程！
			System.out.println(Thread.currentThread().getName() + " ：我爱你，中国！");
		}
	}

}
