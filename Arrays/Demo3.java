package Arrays;

public class Demo3{
   public static void main(String[] args){
    // multi-Dimentional Array with each row different length

    int[][] marks = new int [3][];

    marks[0] = new int[1];
    marks[1] = new int[2];
    marks[2] = new int[3];
    
    marks[0][0] = 56;

    marks[1][0] = 49;
    marks[1][1] = 89;

    marks[2][0] = 78;
    marks[2][1] = 96;
    marks[2][2] = 85;
    /*
    []
    [] []
    [] [] []
    */ 

    for(int row=0; row < marks.length; row++){
        for(int col=0; col<marks[row].length; col++){
            System.out.print(marks[row][col]+" ");
        }
        System.out.println();
    }

   }
}
