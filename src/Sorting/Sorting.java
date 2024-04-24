package Sorting;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = input.nextInt();
        System.out.print("Enter second number :");
        int b = input.nextInt();
        System.out.print("Enter third number :");
        int c = input.nextInt();
        if (a>b && a>c){
            System.out.print("Biggest number is first number");
        }
        else if (b>a && b>c){
            System.out.print("Biggest number is second number");
        }
        else if (c>a && c>b){
            System.out.print("Biggest number is third number");
        }
        else {
            System.out.print("no largest number" );
        }

    }
}
