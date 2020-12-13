package thread;

public class MainOfSynFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedFunction sf = new SynchronizedFunction();
		Thread th01 = new Thread(sf);
		Thread th02 = new Thread(sf);
		Thread th03 = new Thread(sf);
		th01.start();
		th02.start();
		th03.start();
	}

}
