public class Demo4 {
    public static void main(String[] args){

        // Under the loop we can use in finite variable

        // for(int i =1, j=1;i<=10;i++,j++){
        //     System.out.println(i*j);
       
        // }

        boolean b = true;
        for(int i =1; b == true; i++){
            System.out.println(i);
           if(i==10){
             b = false;
           }
        }
    }
}
