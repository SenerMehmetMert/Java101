package BodyMassIndex;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg, m;
        System.out.print("Please enter your height (in metres):");
        m = sc.nextDouble();
        System.out.print("Please enter your weight:");
        kg = sc.nextDouble();
        double bmi =kg/(m*m);
        System.out.println("Your BMI is "+bmi);
    }
}
