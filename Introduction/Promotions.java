public class Promotions {
    public static void main(String[] args) {
       byte b=42;
         char c='a';
            short s=1024;
            int i=50000;
            float f=5.67f;
            double d=0.1234;
            double result = (f * b) + (i / c) - (d * s);
            // f*b is promoted to float, i/c is promoted to int, d*s is promoted to double 
            // the final result is promoted to double because it is the largest type among the operands
            System.out.println((f * b) + " + " + (i / c) + " - " + (d * s) + " = " + result);
    }
}
