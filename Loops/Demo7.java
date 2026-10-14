package Loops;

public class Demo7 {
    public static void main(String[] args){
        // jump statement without use Continue

        // for(int i =1; i<=10; i++){
        //    if( i % 2 != 0){
        //     System.out.println(i);
        //    }
        // }

        for(int i = 1; i<= 10;i++){
            if( i % 2 ==0){
                continue;
            }
            System.out.println(i);

        }

    }
}
