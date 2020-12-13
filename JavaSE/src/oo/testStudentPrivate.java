package oo;


public class testStudentPrivate {
	
	public static void main(String[] args) {
		StudentPrivate sp = new StudentPrivate();
//		private属性不可以直接访问
//		sp.name = "zhangsan";
//		sp.age = 18;
		sp.setAge(10);
		sp.setName("Danny");
		sp.setMale(true);
		System.out.println("name: " + sp.getName());
		System.out.println("age: " + sp.getAge());
		System.out.println("male: " + sp.isMale());
	}
	
}
