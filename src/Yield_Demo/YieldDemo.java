package Yield_Demo;
class MyDemoThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //Yield is used to give up the CPU temporarily
            Thread.yield();
            System.out.println("Child Thread Job....."+i);
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class YieldDemo {
    public static void main(String[] args) {
        MyDemoThread t1=new MyDemoThread();
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread.... "+i);
        }

    }



}
