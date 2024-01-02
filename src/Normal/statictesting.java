package Normal;

public class statictesting {

    static int a=10;
    public static void main(String[] args) {
        System.out.println(a);
        statictesting obj=new statictesting();
        obj.test();
    }

    public void test(){
        a=11;
        System.out.println(a);
    }

}
