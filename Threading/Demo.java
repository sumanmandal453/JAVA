public class Demo {
    public static void main(String[] args) {
        //Threads
        MyThread t1 = new MyThread();
        t1.start(); //start method will call run method
    }
}

// Thread class extend
class MyThread extends Thread{
    @Override
    public void run(){
        //logic there
        System.out.println("Thread is running");
    }
}
/*
t1.start() will call run method and run method will execute the logic there. If we call t1.run() then it will not create a new thread and it will execute the logic in the main thread. So, to create a new thread we have to call start method.
t1.start() --> JVM ask O.S to create a new thread --> thread gets stack and program counter space --> Thread execute run method
*/
