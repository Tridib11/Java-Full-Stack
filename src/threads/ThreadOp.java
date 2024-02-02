package threads;
class userThread extends Thread{
    @Override
    public void run() {
        System.out.println("start");
        System.out.println("This is user defined thread");
    }
}
public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program started");
        int x=56+76;
        System.out.println("Sum is "+x);
        Thread t=Thread.currentThread();
        t.setName("Triidb");
        String tname=t.getName();
        System.out.println("Thread name "+tname);
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
        System.out.println(t.getId());

        System.out.println("Program ended");

        userThread t1=new userThread();
        System.out.println("1");
        t1.start();
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){

        }
        System.out.println("2");
    }
}
