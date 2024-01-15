package LAmbdas;

public class Main {
    public static void main(String[] args) {
        Cat c=new Cat();
        //printThing(c);

        //Lambda Expression

        printThing(
                ()->{
                    System.out.println("Meow");
                }
        );
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
