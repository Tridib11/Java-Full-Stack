package Interfaces;

public class MultipleInterface {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.food_nonveg();b.food_veg();
    }
}

interface Herbivore{
    void food_veg();
}
interface Carnivore{
    void food_nonveg();
}

class Bear implements Herbivore,Carnivore{
    public void food_veg(){
        System.out.println("Eats vegeterian food");
    }
    public void food_nonveg(){
        System.out.println("Eats NonVegeterian food");
    }
}
