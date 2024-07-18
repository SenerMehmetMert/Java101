package Factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , fac=1;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fac = fac*i;
        }

        System.out.print(fac);
    }
}
