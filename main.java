package Ben;

import java.util.Scanner;

public class Ben {
	public static void main(String[] args) {
		//Person person1 = new Person("Peleg", 15); - person is abstract - we can only create inherited objects
		Student student1 = new Student("Ben", 15);
		Student student2 = new Student("Ruet", 25);
		//System.out.println(person1.getName() + " id: " + person1.getId());
		System.out.println(student1.getName() + " id: " + student1.getId());
		System.out.println(student2.getName() + " id: " + student2.getId());
		//System.out.println(person1.getName() + ": " + person1.amountOfPersons());
		System.out.println(student1.getName() + ": " + student1.amountOfPersons());
		System.out.println(student2.getName() + ": " + student2.amountOfPersons());
		//System.out.println(person1.courses + ": " + person1.amountOfPersons());
	}
}