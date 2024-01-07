package CONSTRUCTOR;

class Child {
    String name;
    Child(String name){
        this.name=name;
    }

}
public class parent extends Child {
    String name;
    parent(String n1,String n2){
        super(n1);
        this.name=n2;
    }
    void print(){
        System.out.println(super.name+" "+name);
    }

    public static void main(String[] args) {
        parent p=new parent("Child","Parent");
        p.print();

    }

}

