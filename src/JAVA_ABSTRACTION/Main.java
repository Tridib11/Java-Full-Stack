package JAVA_ABSTRACTION;
/*abstract =
abstract classes cannot be instantiated, but they can have a subclass
abstract methods are declared without an implementation
*/
public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        car.go();
    }
}
