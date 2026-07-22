public class Demo{
    public static void main(String[] args) {
        // integers--> byte, short, int, long
        // range of byte is -128 to 127
        // range of short is -32768 to 32767
        // range of int is -2147483648 to 2147483647
        // range of long is -9223372036854775808 to 9223372036854775807
        //  Binary(2), Octal(8), Decimal(10), Hexadecimal(16)
        // byte b=5;
        // byte b=0b101; // binary literal
        // byte b = 05; // octal literal(0-7 only)
        byte b=0x5; // hexadecimal literal(0-15 only)(0-9 and A-F)
        short s=10;
        int i=15;
        long l=12_34_56_789; // long literal (suffix L or l)
        // floating point numbers--> float, double
        float f=5.5f; //single precision floating point number
        double d=10.5; // double precision standard way
        double d1=6.02_2e23; // double precision floating point number(scientific notation)(6.022*10^23)
        // character--> char
        char c='A'; // "A"---> integer--->binary---> memory
        // boolean--> boolean
        boolean bool=true;
        System.out.println("integers :"+b+", "+s+", "+i+", "+l);
        System.out.println("floating point numbers :"+f+", "+d+", "+d1);
        System.out.println("character :"+c);
        System.out.println("boolean :"+bool);
    }
}