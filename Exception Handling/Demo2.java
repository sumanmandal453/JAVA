public class Demo2 {
   public static void main(String[] args){
    int a=5;
    int b=0;

    method1(a,b);
   }
   private static void method1(int a, int b){
    method2(a,b);
   }
   private static void method2(int a, int b){
    System.out.println(a/b);
   }
}
