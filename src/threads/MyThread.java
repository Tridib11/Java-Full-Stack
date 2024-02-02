package threads;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("value of i "+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread t=new Thread(t1);
        t.start();
    }
}
