package ExponentNumber;
import java.util.Scanner;
public class ExponentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a exponent");
        int exp = sc.nextInt();
        int square=1;

        for (int i = 1; i <= exp; i++) {
            square=square*num;
        }
        System.out.print(square);




            }
        }






