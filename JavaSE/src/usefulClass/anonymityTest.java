package usefulClass;

import java.util.Scanner;

public class anonymityTest {
	
	public static void main(String[] args) {
		// 使用匿名类
//		int a = new Scanner(System.in).nextInt();
//		System.out.println("a= " + a);
		
		// 匿名类作为返回值
		int a = ScannerReturn(new Scanner(System.in));
	}
	
	// 为什们需要是静态的函数才能被调用？
	public static int ScannerReturn(Scanner sc) {
		int a = sc.nextInt();
		return a;
	}
}
