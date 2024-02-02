package threads;

public class MyAnotherThread extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >=1 ; i--) {
            System.out.println("Another thread "+ i );
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }

    }
}
