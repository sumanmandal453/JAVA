public class Demo6 {
    public static void main(String[] args){
        // thread new stage
        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(() -> {
                System.out.println("Current Thread Name is:"+Thread.currentThread().getName());
                System.out.println("Main state:"+mainThread.getState());
        });
        System.out.println(t1.getState());
        // Runnable stage
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE, TERMINATED
        
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}

        System.out.println(t1.getState()); // TERMINATED
       
    }
}
