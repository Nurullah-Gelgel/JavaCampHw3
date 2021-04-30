package Homework3;


public class UserManager{

		public void add(User user){
			System.out.println(user.getName() + user.getLast_name() +  "  kaydedildi.");

		}


		public void SignIn(User user){

			System.out.println("Giriþ Baþarýlý.");
		}

		public void addUser(User[] users){

		for (User user:users) {
			add(user);
		}


	}

	public void update(User user){

		System.out.println("Bilgiler güncellendi  ");
	}

}
