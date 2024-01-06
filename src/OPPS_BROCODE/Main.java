package OPPS_BROCODE;

public class Main{
    public static void main(String[] args) {
        CAR obj=new CAR();
        System.out.println(obj.make);
        System.out.println(obj.model);
        obj.brake();
        obj.drive();
    }
}
