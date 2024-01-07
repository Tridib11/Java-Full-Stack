package ENCAPSULATION_BROCODE;
/*
attributes of a class will be hidden or private,
Can be accessed only through methods (getters & setters)
You should make attributes private if you don't have a reason to make ther
 */
public class Main {
    public static void main(String[] args) {
        Car car=new Car("BMW","M3",2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.setYear(2012);
        System.out.println(car.getYear());

    }
}
