package Multithreading_creating;

class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        System.out.println("Tridib");
    }
}
public class Driver{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadDemo1 t1=new ThreadDemo1();
        System.out.println(t1.getName());
        Thread.currentThread().setName("Tridibs Thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        t1.setPriority(10);
        System.out.println(t1.getPriority());

    }

}

/*
Thread Priority

- 0 - Minimum Priority
- 5 - Normal Priority
- 10 - Max Prioriy
*/
