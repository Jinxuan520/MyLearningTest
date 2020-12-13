package thread;


public class Person {
	
	private String name;
	

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void run() {
		// circulate twenty once!
		for(int i=1; i<=20; i++) {
			System.out.println(this.name + " ---> Tomorrow will be better!");
		}
	}
	
}
