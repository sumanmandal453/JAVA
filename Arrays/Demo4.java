package Arrays;

public class Demo4 {
    public static void main(String[] args){

        // 1-D array
        int [] roll_num ={101, 102, 103};

        for(int i =0; i< roll_num.length; i++){
            System.out.println(roll_num[i]);
        }
        System.out.println("------------------------");
        // 2-D Arrays
        int[][] marks = {
            {45,30,90},
            {56,59,89},
            {63,75,45}
        };
        
        for(int row=0; row<marks.length;row++){
            for(int col=0; col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }
    }
}
