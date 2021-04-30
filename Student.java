package Homework3;

public class Student extends User {
	
	private int Id;

	public int getNumber() {
		return Id;
	}

	public void setNumber(int number) {
		this.Id = number;
	}

	public Student() {
		super();
	}

	public Student(String name, String last_name, String password, String email) {
		super(name, last_name, password, email);
	}
}
