package Homework3;

public class Instructor extends User {

	private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Instructor() {
        super();
    }

    public Instructor(String name, String last_name, String password, String email) {
        super(name, last_name, password, email);
    }
}
