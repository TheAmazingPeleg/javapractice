package Ben;

public abstract class Person { //Abstract - make the class only a scheme - unable to create individual objects type Person
	//Members
	private final int id;
	protected String name;
	protected int age;
	public int pub;
	static private int counter = 0;

	//CTORS
	public Person() {
		this.counter ++;
		this.id = this.counter;
		this.name = "Unknown";
		this.age = 0;		
	}
	public Person(String name, int age) {
		this.counter ++;
		this.id = this.counter;
		this.name = name;
		if(age > 0)
			this.age = age;
	}
	
	//Getters and Setters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age > 0 && this.age != age)
			this.age = age;
	}
	
	//Operational functions
	public int amountOfPersons() {
		return this.counter;
	}
}
