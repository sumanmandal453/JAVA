package Arrays;

public class Demo1 {
    public static void main(String[] args){
        int[] roll_num = new int[3];
        // int roll_num[] = new int[3];

        // 101, 102, 103

        int x = 101;
        for(int i = 0; i < roll_num.length;i++){
            roll_num[i] = x;
            x++;
            System.out.println(roll_num[i]);
        }

        System.out.println("We can also use loop for printing the output");
        for(int i = 0; i < roll_num.length;i++){
            System.out.println(roll_num[i]);
        }
    }
}

