package ChinaZodiac;
import java.util.Scanner;
public class ChinaZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your years of birth");
        int years = sc.nextInt();
        if (years %12==0) {
            System.out.println("You are monkey");
        }
        if (years %12==1) {
            System.out.println("You are cock");
        }
        if (years %12==2) {
            System.out.println("You are dog");
        }
        if (years %12==3) {
            System.out.println("You are pig");
        }
        if (years %12==4) {
            System.out.println("You are mouse");
        }
        if (years %12==5) {
            System.out.println("You are ox");
        }
        if (years %12==6) {
            System.out.println("You are tiger");
        }
        if (years %12==7) {
            System.out.println("You are rabbit");
        }
        if (years %12==8) {
            System.out.println("You are dragon");
        }
        if (years %12==9) {
            System.out.println("You are snaeke");
        }
        if (years %12==10) {
            System.out.println("You are horse");
        }
        if (years %12==11) {
            System.out.println("You are sheep");
        }
    }
}
