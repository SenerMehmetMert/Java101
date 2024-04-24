package ActivityRecommendation;
import java.util.*;

public class ActivityRecommendation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Degree :");
        int degree = input.nextInt();
        if (degree>30){
            System.out.println("You are over 30 degrees");
            System.out.println("I think you should swim");
        }
        else if (degree>15 && degree<=30){
            System.out.println("You are over 15 degrees");
            System.out.println("I think you should learn java");
        }
        else if (degree<=15 && degree>0){
            System.out.println("You are over 15 degrees");
            System.out.println("I think you should sleep");
        }

    }
}
