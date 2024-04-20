package Circle;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double r , a ,pi=3.14 , area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter half diameter");
        r=sc.nextDouble();
        System.out.print("Enter centre angle");
        a=sc.nextDouble();
        area=(pi*(r*r)*a)/360;
        System.out.println("The area of the circle is "+area);
    }

}
