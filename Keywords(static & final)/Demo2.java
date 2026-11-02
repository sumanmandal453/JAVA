// final

public class Demo2 {
    public static void main(String[] args){
        Random s1 = new Random();
        System.out.println(s1.PI);

        final int  x;
        x= 4;
        // not posible now if i do x =5;
        //x =5;  The final local variable x may already have been assignedJava(536870969)

        System.out.println(x);

    }    
}


class Random{
    static final double PI;
    // or static final double PI = 3.14;

    // Random(){
    //     PI = 3.14;

    // }
    // this is error come because we can not define static variable in constructor
    // we can do belo this
    static {
        PI = 3.14;
    }
}