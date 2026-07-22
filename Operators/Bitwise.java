public class Bitwise {
    public static void main(String[] args) {
        int a =2;
        int b=3;
        int c = a&b;
        int d = a|b;
        int e = a^b;
        int f = ~a;
        System.out.println(c+"," +d+","+e+","+f);

        // Shift operators
        int g =1;
        g= g<<1;
        System.out.println(g);
        g= g<<30;
        System.out.println(g);
        g=g<<31;
        System.out.println(g);
    }
}
