public class Demo3 {
    public static void main(String[]args){
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getId());

    Thread t1 = new Thread(() -> {
        System.out.println("My 1st thread name is:"+Thread.currentThread().getName());
        System.out.println("1st Thread id is:"+Thread.currentThread().getId());
    });

    Thread t2 = new Thread(() -> {
        System.out.println("My 2nd thread name is:"+Thread.currentThread().getName());
        System.out.println("2ndThread id is:"+Thread.currentThread().getId());
    });
    t1.start();
    t2.start();
}
    
}

