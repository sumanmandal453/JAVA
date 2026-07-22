public class Demo6 {
    public static void main(String[]args){
         try {
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");
                System.out.println(5/0); // new ArithmeticException: "/ by zero" is created and thrown
                System.out.println("Inner try ends");
            }
            catch(NullPointerException e){
                System.out.println(" Null pointer exception:inner catch");
                e.printStackTrace();
            }
            System.out.println("Outer try ends");

        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed:Outer Catch");

        }
    }
    
}
