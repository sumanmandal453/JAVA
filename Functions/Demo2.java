public class Demo2 {
    public static void main(String[] args){
        // function overloading
        int x= sum(2,3);
        System.out.println(x);
        int y = sum(4,5);
        System.out.println(y);
        int z = sum(2,3,5);
        System.out.println(z);
        greet("Suman", 23);
        greet(21,"Aysika");
    }
    static int sum(int a, int b){ // different no. of parameters
        return (a+b);
    }
    static int sum( double a, double b){
        return (int)(a+b);
    }
    static int sum(int a, int b, int c){ //different types of parameters
        return (a+b+c);
    }
    static void greet(String name, int age){
        System.out.println("Hi " + name + " . Your age is "+ age);
    }
    static void greet(int age, String name){
        System.out.println("Hi " + name + " . Your age is "+ age);
    }
}
