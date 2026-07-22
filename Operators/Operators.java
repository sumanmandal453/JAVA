
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b; // addition
        int d = a - b; // subtraction
        int e = a * b; // multiplication
        int f = b / a; // division
        int g = b % a; // modulus

        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("b / a = " + f);
        System.out.println("b % a = " + g);

        int h = 5;
        // h=h+a; // compound assignment operator
        // System.out.println("h after h=a+h: " + h);
        h +=a; // compound assignment operator
        System.out.println("h after h+=a: " + h);
        h-=a; // compound assignment operator
        System.out.println("h after h-=a: " + h);
        h *=a; // compound assignment operator
        System.out.println("h after h*=a: " + h);
        h /=a; // compound assignment operator
        System.out.println("h after h/=a: " + h);
        h %=a; // compound assignment operator
        System.out.println("h after h%=a: " + h);   

    //  increment and decrement operators
        int x = 5;
        System.out.println("x before increment: " + x);
        x++; // post-increment
        System.out.println("x after post-increment: " + x);
        ++x; // pre-increment
        System.out.println("x after pre-increment: " + x);
        x--; // post-decrement
        System.out.println("x after post-decrement: " + x);
        --x; // pre-decrement
        System.out.println("x after pre-decrement: " + x);

        int j = 7;
        j++;
        ++j;
        int k = j++; // k=j; j=j+1; // post-increment, k gets the value of j before incrementing
        System.out.println(+j+"," +k);
        int l = ++j; // j=j+1; l=j; // pre-increment, j gets incremented first and then l gets the value of j
        System.out.println(+j+","+l);
    }
    
}
