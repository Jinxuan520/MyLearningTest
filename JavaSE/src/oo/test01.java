package oo;

public class test01 {
	public String nameString;
	public int age;
	public double money;
	
	// constrution methods
	public test01() {
		super();
	}
	public test01(String nameString, int age, double money) {
		super();
		this.nameString = nameString;
		this.age = age;
		this.money = money;
	}
	
	// getter and setter
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
