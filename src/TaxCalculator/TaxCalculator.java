package TaxCalculator;
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax , price;
        System.out.print("Enter price:");
        price= input.nextDouble();
        if(price>0 && price < 1000){
            tax=(price*18)/100;
            System.out.println("price without tax:"+price);
            System.out.println("price with tax:"+(price+tax));
            System.out.println("Tax rate:%18");
        } else if (price>1000) {
            tax=(price*8)/100;
            System.out.println("price without tax:"+price);
            System.out.println("price with tax:"+(price+tax));
            System.out.println("Tax rate:%8");
        }
    }
}
