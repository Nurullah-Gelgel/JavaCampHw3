package Homework3;

public class StudentManager extends UserManager  {


    @Override
    public void SignIn(User user) {
        System.out.println("Öğrenci Girişi Başarılı.");

    }

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " adlı kişi öğrenci olarak eklendi. ");
    }
}
