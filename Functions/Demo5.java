// print Fibonacci Series
import java.util.*;

public class Demo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int x= fin(n);
        System.out.println(x);

    }
    static int fin(int n){
        if(n==0 || n==1){
            return 1;
        }
     int x= fin(n-1);
     int y = fin(n-2);
     return (x+y);
    }
    
}
