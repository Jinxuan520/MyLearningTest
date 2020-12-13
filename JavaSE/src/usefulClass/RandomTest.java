package usefulClass;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int a;
		for(int i=0; i<=99; i++) {
			a = rd.nextInt(90);
			System.out.println("the random number is:" + a);
		}
	}

}
