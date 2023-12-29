
package Inheritance;
//Inheritance is when properties and methods of base class is passed on to the derived class
public class Animal {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}
class Animal_testing{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal_testing{
    int fins;
    void swims(){
        System.out.println("Swims in water");
    }
}
