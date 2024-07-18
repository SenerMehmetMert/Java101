package Harmonic;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double total=0.0;
        for (int i = 1; i <= n; i++) {
            total+=(1.0/i);
        }

        System.out.print("Harmonic of " + n + " is " + total);
    }
}
