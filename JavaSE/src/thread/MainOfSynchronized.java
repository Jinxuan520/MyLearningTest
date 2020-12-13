package thread;

public class MainOfSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		synchronizedRunnable sr = new synchronizedRunnable();
		Thread th01 = new Thread(sr);
		Thread th02 = new Thread(sr);
		Thread th03 = new Thread(sr);
		th01.start();
		th02.start();
		th03.start();
	}

}
