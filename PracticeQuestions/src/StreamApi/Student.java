package StreamApi;

public class Student {
	
	int roll;
	int marks;
	int age;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int roll, int marks, int age) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.age = age;
	}

}
