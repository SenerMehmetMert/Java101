package Combination;
import java.util.*;
public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,r ,totalN=1 , totalR=1, combination ,dif , totalDif=1;
        System.out.print("Enter the number of elements of the set:");
        n=sc.nextInt();
        System.out.print("Enter the number of groups:");
        r=sc.nextInt();
        dif=n-r;

        for (int i=1;i<=n;i++){
            totalN*=i;
        }

        for (int i=1;i<=r;i++){
            totalR*=i;
        }

        for (int i=1;i<=dif;i++){
            totalDif*=i;
        }
        combination=totalN/(totalR*totalDif);

        System.out.println(combination);

    }
}
