package POLYMORPHISM_BROCODE;
//The ability of an object to identify as more than one type
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
