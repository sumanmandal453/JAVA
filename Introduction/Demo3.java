public class Demo3 {
    public static void main(String[] args){
        // implicit conversion
        // (byte--->int)
        byte b=10;
        int i;
        i=b;
        System.out.println(i);

        // character to interger
        char c='A';
        int j;
        j=c;
        System.out.println(j);

        // Explicit conversion
        // int to byte
        int k=300;
        byte m;
        m=(byte)k; // type casting
        System.out.println(m); // it will give wrong output because 300 is out of range of byte(-128 to 127)
    //300%256=44

    // Truncating Conversion
    float f=13.56f;
    int n;
    n=(int)f; // it will give 13 because it truncates the decimal part
    System.out.println(n);

    // boolean to int conversion is not allowed in Java

    // promotions
    byte x=50;
    x=(byte)(x*2); // it will give 100 because the result of b*2 is promoted to int and then assigned back to byte
    System.out.println(x); // it will give 100 because the result of b*2 is promoted to int and then assigned back to byte
    }  
}
