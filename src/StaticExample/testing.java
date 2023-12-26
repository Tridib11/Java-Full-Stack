package StaticExample;

public class testing {
    public static void main(String[] args) {
//        Human Tridib =new Human(12,"tridib",10000,false);
//        Human rahul =new Human(12,"rahul",15000,false);
//        System.out.println(Human.polulation);
//        System.out.println(Human.polulation);
        fun();
    }
    static void fun(){
        testing obj=new testing();
        obj.func2();
    }
    void func2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello man sup");
    }
}
