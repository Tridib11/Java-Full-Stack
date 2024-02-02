package Synchronisation;

class PrintMsg{
    public void m1(){
        for (int i = 0; i < 5; i++) {

            synchronized (this){
                System.out.println("Extecuted by "+Thread.currentThread().getName());
                System.out.println("Hello Tridib");
            }
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Bye Tridib");
        }
    }
}

class synThreadDemo extends Thread{
    PrintMsg p;
    synThreadDemo(PrintMsg p){
        this.p=p;
    }
    @Override
    public void run() {
        p.m1();
    }
}
public class SynchronisationDemo {
    public static void main(String[] args) {
        PrintMsg p=new PrintMsg();
        synThreadDemo t1=new synThreadDemo(p);
        synThreadDemo t2=new synThreadDemo(p);
        t1.setName("Ye he t1");
        t2.setName("Ye he t2");
        t1.start();
        t2.start();
    }
}
