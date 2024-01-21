package Exception_Handling;

public class Parse {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("asdasdad");
            System.out.println(myInt);
        }
        catch (NumberFormatException e){
            System.out.println("Its a string of characters takes string of numbers");
        }
    }
}
