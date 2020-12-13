package thread;

public class ExtendThread01 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for(int i=0; i<20; i++) {
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + i);
		}
	}
	
	
}
