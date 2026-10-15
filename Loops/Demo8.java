//Code Blocks
public class Demo8 {
    public static void main(String[] args){
     first: {
        second:{
            third: {
                System.out.println("Hello");
                break first;
                
            }
        }
     }
    }
}