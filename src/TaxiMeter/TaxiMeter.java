package TaxiMeter;
import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km , opening=10.0, total;
        System.out.print("Enter Kilometers: ");
        km = sc.nextDouble();
        total=(km*2.20)+opening;
        total=(total<20)?20:total;
        System.out.println("Taxi Meter is "+total);

    }
}
