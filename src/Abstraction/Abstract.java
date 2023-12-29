package Abstraction;
public class Abstract {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
//        h.changeColor();
        System.out.println(h.color);
        Chicken c=new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    void changeColor(){
        color="Dark Brown";
        System.out.println(color);
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
    void changeColor(){
        color="Yellow";
        System.out.println(color);
    }
}
