package Login;
import java.util.*;
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username="admin" , password="1234";
        System.out.print("Enter your username: ");
        String user = input.nextLine();
        System.out.print("Enter your password: ");
        String pass = input.nextLine();
        if(user.equals(username) && pass.equals(password)){
            System.out.println("You are logged in!");
        } else {
            System.out.println("Forgot your password?");
            int control = input.nextInt();

            switch (control) {
                case 1:
                    System.out.println("Yeni Şifre Oluşturunuz: ");
                    String newpass = input.next();

                    if (newpass.equals(password)) {
                        System.out.println("Şifre Oluşturulamadı Lütfen Başka Bir Şifre Deneyiniz.");
                        

                    }
                    else {
                        System.out.println("Şifre Başarılı Bir Şekilde Oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış Yaptınız. ");
                    break;
                default:

            }
        }
    }
}
