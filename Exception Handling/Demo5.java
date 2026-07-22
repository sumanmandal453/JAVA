public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try starts");
            try{
                System.out.println("Inner try starts");
                System.out.println(5/0); // new ArithmeticException: "/ by zero" is created and thrown
                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e){
                System.out.println("Division by zero is not allowed:inner catch");
                e.printStackTrace();
            }
            System.out.println("Outer try ends");

        }
        catch(Exception e){
            System.out.println("Division by zero is not allowed:Outer Catch");

        }
    }
}

/*
Outer try starts
Inner try starts
new ArithmeticException: "/ by zero" is created and thrown
Division by zero is not allowed:inner catch
java.lang.ArithmeticException: / by zero
        at Demo5.main(Demo5.java:7)
*/