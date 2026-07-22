public class Demo4 {
    public static void main(String[] args){
        // method1(5,0);
        System.out.println("Step1:");
        try{
            method1(5,0);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
    }


    private static void method1(int a , int b){
            method2(a,b);
    //     try{
    //         method2(a,b);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("Division by zero is not allowed");
    //     }
    // }
    }
    private static void method2( int a, int b){
        System.out.println(a/b);
        System.out.println("Step2:");
        // try{
        //     System.out.println(a/b);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Division by zero is not allowed");
        // }
        }
 }

//  main()--> method1()---> method2()---> exception occurs---> method2()---> method1()---> main()---> catch block of main() is executed


/*
step1
Division by zero is not allowed

 */
    
