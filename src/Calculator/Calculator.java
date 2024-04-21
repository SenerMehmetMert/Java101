package Calculator;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = input.nextInt();
            System.out.println("Enter the second number: ");
            int b = input.nextInt();
            System.out.println("Enter the operator:");
            String c = input.next();

            switch (c){
                case "+":
                    System.out.println("a+b="+(a+b));
                    break;
                case "*":
                    System.out.println("a*b="+(a*b));
                    break;
                case "/":
                    System.out.println("a/b="+(a/b));
                    break;
                case "-":
                    System.out.println("a-b="+(a-b));
                    break;
            }
        }

    }
}
