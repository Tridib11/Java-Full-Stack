package Multithreading_creating;

class DemoThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Starting");
        }
        try{
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        DemoThread2 t1=new DemoThread2();
        t1.start();
        t1.join(); //executed by main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
