package AirlineTicket;
import java.util.Scanner;
public class AirlineTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age : ");
       int age = input.nextInt();

        System.out.print("Enter distance : ");
       int distance = input.nextInt();
       double distance_pay=distance*0.1;
        System.out.println("Enter Journeytype: (1 way 2 round trip)");
        int journey_type=input.nextInt();
        if((age > 0 && distance > 0) && (journey_type == 1 || journey_type == 2)){
            if(age<12 && journey_type==2){
                double price =(distance_pay/2)*0.2;
                System.out.println("Journey completed total amount :"+price);
            } else if (age<12) {
                double price2 = distance_pay/2;
                System.out.println("Journey completed total amount :"+price2);
            } else if (((age >= 12) && (age < 24)) && (journey_type == 2)) {
                double price3 = (distance_pay*0.1)*0.2;
                System.out.println("Journey completed total amount :"+(distance_pay-price3));
            }else if ((age >= 12) && (age < 24)) {
                double price4 = (distance_pay*0.1);
                System.out.println("Journey completed total amount :"+(distance_pay-price4));
            }else if (age>65 && journey_type == 2) {
                double price5 = (distance_pay*0.3)*0.2;
                System.out.println("Journey completed total amount :"+(distance_pay-price5));
            }
            else if (age>65 ) {
                double price6 = (distance_pay*0.3)*0.2;
                System.out.println("Journey completed total amount :"+(distance_pay-price6));
            }

        }
        else {
            System.out.println("incorrect data entry");
        }

    }
}
