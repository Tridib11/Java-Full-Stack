package Abstract_Classes_and_encapsulation;
public abstract class Animal {
    private String name;// making the name as private
    private int age;//making the name as private
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //implementing encapsulation
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract void voice();

}

 class Dog extends Animal{
       public Dog(String name, int age){
        super(name,age);
    }

     @Override
    public void voice() {
        System.out.println("Woof");
    }
}

//Implementing MultipleInheritance

interface MultipleInheritance {
    void MulInherit();
}

class Mi implements MultipleInheritance{
    public void MulInherit(){
        System.out.println("Multiple Inheritance works");
    }
}


class Main{
    public static void main(String[] args) {
        Dog dog=new Dog("Bobby",21);
        dog.voice();
        System.out.println(dog.getAge());
        System.out.println(dog.getName());

        Mi d=new Mi();
        d.MulInherit();
    }
}