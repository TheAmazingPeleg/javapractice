package Ben;

public class Student extends Person {
	public int courses;
	public String[] coursesList;
	public int avg;
	public int[] grades;
	
	public Student(String name, int age) {
		super(name, age);
	}
	public Student(String name, int age, int courses, String[] coursesList, int[] grades){
		super(name, age);
		this.courses = courses;
		this.coursesList = coursesList;
		this.grades = grades;
		for(int i = 0; i < courses; i ++) {
			this.avg += this.grades[i];
		}
		this.avg /= this.courses;
	}
}
