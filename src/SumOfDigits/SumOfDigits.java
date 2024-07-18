package SumOfDigits;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num= scanner.nextInt();

        int total = 0;
        while (num != 0) {
            total += num % 10;
            num /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + total);
    }
}
