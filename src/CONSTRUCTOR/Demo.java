package CONSTRUCTOR;

//a constructors first line should always be this() or super()
//if there is nothing metioned this() or super() then by default its super()

class Test{
    Test(){
        System.out.println("Mein test hu....");
    }
}
public class Demo extends Test{
    int a;
    Demo(){
        //super();//Calling parent class constructor(Test is the parent class in here)
        this(10);//used to call the current class constructor
        System.out.println("Child.....");
    }
    public Demo(int i){ //there is nothing in here so by default the super() (parent class is called)
        System.out.println("Args");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();

    }
}
