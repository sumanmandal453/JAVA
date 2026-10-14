package Loops;

public class Demo6 {
    public static void main(String[] args){
        // jump Statements in java( break, continue)


        //  for(int i =1; i <=10;i++){
        //     System.out.println(i);
        //     if( i >5){
        //         break;
        //     }

        //  }


        //wheather the number is prime of not
        int i;
       int p=9;
        for(i=2; i < p;i++){
            if(p % i ==0){
                System.out.println("the number is not prime");
                break;
            }
        }
        if(i == p){
            System.out.println("The number is prime.");
        }

    }
}
