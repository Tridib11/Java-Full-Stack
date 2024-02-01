package JionDemo;
class DemoThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Starting");
        }
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {

    }
}
