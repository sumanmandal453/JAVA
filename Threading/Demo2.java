public class Demo2 {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        Thread r1 = new Thread(t1);
        r1.start();
        //or
        // use lambda expression
        // Thread v1 = new Thread(() -> System.out.println("Thread is running!"));
        // v1.start();

    }
}

//Thread using runable interface
class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}