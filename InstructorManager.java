package Homework3;

public class InstructorManager extends UserManager {

    @Override
    public void SignIn(User user) {

        System.out.println("Yönetici Girişi Başarılı.");
    }

    @Override
    public void add(User user) {
        System.out.println( user.getName()+ " adlı kişi instructor olarak eklendi. ");
    }

    public void delete(User user){

        System.out.println("Uye silindi");
    }
}
