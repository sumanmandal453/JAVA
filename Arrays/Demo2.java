package Arrays;
 // 2-D Arrays in java
public class Demo2 {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];

        marks[0][0] = 50;
        marks[0][1] = 30;
        marks[0][2] = 90;

        marks[1][0] = 40;
        marks[1][1] = 20;
        marks[1][2] = 80;

        marks[2][0] = 60;
        marks[2][1] = 50;
        marks[2][2] = 75;

        for( int row = 0; row < marks.length;row++){
            for(int col=0; col< marks[row].length; col++){
                System.out.print(marks[row][col] +" ");
            }
            System.out.println();
        }
    }
}
