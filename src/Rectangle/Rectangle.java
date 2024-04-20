package Rectangle;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vertical1, vertical2, hypotenuse;
        System.out.print("Enter the height of the rectangle: ");
        vertical1 = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        vertical2= sc.nextDouble();
        hypotenuse = Math.sqrt(Math.pow(vertical1, 2) + Math.pow(vertical2, 2));
        System.out.println("The area of the rectangle is " + hypotenuse);

        triangle_area();
    }

    public static double triangle_area(){
        double a ,b,c, u, area;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        a= sc2.nextDouble();
        b= sc2.nextDouble();
        c= sc2.nextDouble();
        u= (a+b+c) / 2;
        area= Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("Area of a triangle"+area);

        return area;
    }
}
