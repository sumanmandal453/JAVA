public class Demo3 {
    public static void main(String[] args){
//    chaining of functions

    A();
    System.out.println("How about you ?");

    }
    static void A(){
        B();
        System.out.println("my age is 23");
    }
   static  void B(){
    C();
    System.out.println("My name is Suman Mandal");
   }
   static void C(){
    System.out.println("Hi");
   }
}
