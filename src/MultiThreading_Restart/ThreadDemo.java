package MultiThreading_Restart;


//class Demo extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Jai shree ram");
//        }
//    }
//}

class Demo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jai shree ram");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        Thread t=new Thread(d);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }
}
