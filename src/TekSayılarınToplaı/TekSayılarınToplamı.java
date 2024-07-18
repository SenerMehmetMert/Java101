package TekSayılarınToplaı;
import java.util.Scanner;
public class TekSayılarınToplamı {
    public static void main(String[] args) {
        int n, total=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number:");
            n=sc.nextInt();
            if (n%2==1){
                total+=n;

            }
        }
        while (n>0);

        System.out.println("Total is:"+total);
    }
}
