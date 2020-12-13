package thread;

public class AnonymityThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<20; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
			}
			
		}).start();
	}

}
