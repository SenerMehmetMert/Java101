package PowerScope;
import java.util.*;
public class PowerScope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
      for (int i = 1; i <= n; i*=4) {
          System.out.println(i);
      }


      for (int z = 1; z <= n; z*=5) {
          System.out.println(z);
      }
    }
}
