import java.util.*;
public class first {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students : ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of Subjects: ");
        int c = sc.nextInt();

        int[][] marks = new int[r][c];
        for(int i = 0; i< marks.length;i++){
            for(int j = 0; j< marks[i].length;j++){
                System.out.println((i+1)+" Student "+(j+1)+" Subject");
                System.out.print("Enter the marks: ");
                int v =sc.nextInt();
                marks[i][j]= v;
            }
            System.out.println((i+1)+" Student Marks Enter Completed!");
        }
        System.out.println("!Display all Student each Subject Marks!");
        for(int i = 0; i < marks.length;i++){
            for(int j = 0; j< marks[i].length;j++){
        
                System.out.println((i+1)+" Student "+(j+1)+" Subject "+"marks is: "+marks[i][j]);
            }
            System.out.println();
        }
    }
}
