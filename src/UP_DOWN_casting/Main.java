package UP_DOWN_casting;
public class Main {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.display();

        p=(Parent) new child(); //upCasting
        p.display();

        child c=(child) p; //downcasting
        c.display();

    }
}
class Parent{
    void display(){
        System.out.println("Parent is called");
    }
}

class child extends Parent{
    void display(){
        System.out.println("Child is called");
    }
}