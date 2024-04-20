package GreengrocersCase;
import java.util.Scanner;
public class GreengrocersCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pear=2.14 , apple=3.67 , tomato=1.11 , banana=4.5 , total;
        double pear_kg , apple_kg , tomato_kg , banana_kg;
        System.out.print("Enter Pear :");
        pear_kg = sc.nextDouble();
        System.out.print("Enter Apple :");
        apple_kg = sc.nextDouble();
        System.out.print("Enter Tomato :");
        tomato_kg = sc.nextDouble();
        System.out.print("Enter Banana :");
        banana_kg = sc.nextDouble();
        total = (pear*pear_kg)+(apple*apple_kg)+(tomato*tomato_kg)+(banana*banana_kg);
        System.out.print("The total is : "+total);

    }
}
