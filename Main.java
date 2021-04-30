package Homework3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Nurullah ","Gelgel","123456",".......@.....com");

		Instructor instructor1 = new Instructor("Engin"," Demirog","147852",".......@.....com");

		User[] users = {student1, instructor1};

		System.out.println(users);


		UserManager userManager =new UserManager();

		userManager.addUser(users);

		userManager.SignIn(student1);


		userManager.update(student1);


		InstructorManager instructorManager = new InstructorManager();
		instructorManager.delete(instructor1);

	}

}
