public class Demo{
    public static void main(String[] args){
        // function in java
        greet();
        sayHello("Suman");
       int x= getnumber();
       System.out.println(x);
       System.out.println(getnumber());
       System.out.println(multiply(4,6));
       }
    // No input and no output
    static void greet(){
        System.out.println("Hello");
        return;
    }
    // Input and no output
    static void sayHello(String name){
        System.out.println("hello " + name);
        return;
    }
    // No input and output
    static int getnumber(){
        return 10;
    }
    // Input and output
    static int multiply(int a, int b){
        int mul = a*b;
        return mul;
        // return a*b;
    }
}
