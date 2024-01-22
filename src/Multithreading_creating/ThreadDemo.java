package Multithreading_creating;

//class Demo extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i <=5 ; i++) {
//            System.out.println("MultiThreading");
//        }
//    }
//}

//Best way
class Demo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=5 ; i++) {
            System.out.println("MultiThreading");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        Thread t1=new Thread(d);
        t1.start();
        for (int i = 0; i <=5; i++) {
            System.out.println("Main");
        }
    }
}
