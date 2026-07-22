public class Array {
     public static void main(String[] args){
        try{
            int[] arry = {10,20,30,40,50};
            System.out.println(arry[10]);
            System.out.println("next step");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("handle the Index out of bounds");
        }
    }
}
