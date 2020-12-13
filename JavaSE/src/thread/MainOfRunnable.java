package thread;


public class MainOfRunnable {
	
	public static int number = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsRunnable Rable01 = new ImplementsRunnable();
		Thread thread01 = new Thread(Rable01);
		Thread thread02 = new Thread(Rable01);
		thread01.start();
		thread02.start();
	}

}
