package SUPER_KEYWORD_BROCODE;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;

    }

    public String toString(){
        return this.name+"\n"+this.age+"\n";
    }
}
