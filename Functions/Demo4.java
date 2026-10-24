//  print the number 1-10
import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        printnum(a);

    }
    static void printnum(int a){
        if(a==0){
            return;
        }
      printnum(a-1);
      System.out.println(a);

    }
}
