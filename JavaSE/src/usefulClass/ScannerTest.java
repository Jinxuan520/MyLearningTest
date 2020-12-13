package usefulClass;

import java.util.Scanner;

public class ScannerTest {
	
//	Scanner sc = new Scanner(System.in);
//	int a = sc.nextInt();
//	String b = sc.next();
//	String c = sc.nextLine();
//	double d = sc.nextDouble();
//	int e = sc.nextInt();
//	int f = sc.nextInt();
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数：");
		int c = sc.nextInt();
		int test = a > b ? a : b ;
		int max = test > c ? test : c;
		System.out.println("三个数中的最大值是：" + max);
	}
}
