package POLYMORPHISM_BROCODE;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Boat boat=new Boat();

        Vehicle[] racer={car,boat};
        for(Vehicle x:racer){
            x.go();
        }
    }
}
