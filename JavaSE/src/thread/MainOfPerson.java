package thread;

public class MainOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p_01 = new Person("zhangsan");
		Person p_02 = new Person("lisi");
		p_01.run();
		p_02.run();
	}

}
