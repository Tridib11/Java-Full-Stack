package SUPER_KEYWORD_BROCODE;

public class Hero extends Person {
    String Power;
    Hero(String name,int age,String Power){
    super(name,age);

/*This works but not the best way as we have just power in here and the rest is in
 the Person class so we use the super keyword to pass the name and age in the person
 class using the super keyword*/
//        this.name=name;
//        this.age=age;


    this.Power=Power;
    }

    public String toString(){
        return super.toString()+this.Power;
    }
}
