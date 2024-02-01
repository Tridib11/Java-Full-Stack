package JionDemo;

class MyThread3 extends Thread{
    static Thread t1;


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread3 Thread Starting");
            try {
                t1.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class DemoThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Starting");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        DemoThread2 t1=new DemoThread2();
        t1.start();
        t1.join();//executed by main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
