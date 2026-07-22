public class Switch {
    public static void main(String[] args){
        // Switch Statement
        int i = 3;
        switch(i){ // switch expression--> int, byte, short, char, String, enumarations
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater than 3");
        }

    }
    
}
//switch---> limitations --> should evluate to byte,short,int,char, Enumeration.
//No duplicate case values allowed. No case value can be of type long, float, double, boolean. The default keyword is optional and can appear anywhere in the switch statement.
//after JDK7 String is allowed in switch statement.
//after JDK-14 switch expression can be of type byte, short, int, char, String, enumarations and also of type long, float, double, boolean.
