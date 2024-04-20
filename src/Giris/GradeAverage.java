package Giris;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int first, second ,avarage;
       System.out.print("Enter the number of students:");
        first = input.nextInt();
       System.out.print("Enter the number of students: ");
        second = input.nextInt();
       avarage=(first+second)/2;
       System.out.println("The average of students is "+avarage);
       if (avarage>60 && avarage<=100){
           System.out.println("Passed");
       } else if (avarage>100) {
           System.out.println("Enter a value between 1 and 100");
       } else {
           System.out.println("Failed");
       }
    }
}
