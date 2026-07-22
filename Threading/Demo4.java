public class Demo4 {
    public static void main(String[] args){
        Thread t1 =new Thread(()->{
            System.out.println("Current Thread Name is:"+Thread.currentThread().getName());
        });

        t1.start();
        // t1.run();

    }
    
}
// start() vs run() method in Java Thread

// can we start() method multiple times for a thread? No, we can not start() method multiple times for a thread. It will throw IllegalThreadStateException.