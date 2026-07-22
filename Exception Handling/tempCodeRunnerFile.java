public class Demo3 {
    public static void main(String[]args){
    System.out.println("Step1:");
        try{
            int a=5;
            int b=0;
            System.out.println(a/b);  //illegal operation---> new ArithmeticException ("/ by zero") is created and thrown
            System.out.println("Step2:");
            // risky code that may throw exception
        }

        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //privent code/ handle code to recover from exception
        }
        finally{
            System.out.println("Finally block is executed");

        }
        System.out.println("Step2:");
    }
    
}