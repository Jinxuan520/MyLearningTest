package oo;


public class StudentPrivate {
	
	private String name;
	private int age;
	private boolean male;
	
	public boolean setMale(boolean bool) {
		return this.male = bool;
	}
	public boolean isMale() {
		return male;
	}
	public String setName(String name) {
		this.name = name;
		return this.name;
	}
	public int setAge(int age) {
		// 增加设值限制，这是setter函数的一大作用！
		if(this.age>18) {
			this.age = age;
			return this.age;
		}else {
			System.out.println("年龄不合法！");
		}
		return age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
//	public static void main(String[] args) {
//		StudentPrivate sp = new StudentPrivate();
//		sp.name = "zhangsan";
//		sp.age = 18;
//		System.out.println("name: " + sp.name);
//		System.out.println("age: " + sp.age);
//	}
}
