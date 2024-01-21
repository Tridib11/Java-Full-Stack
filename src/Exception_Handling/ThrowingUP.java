package Exception_Handling;

public class ThrowingUP {
    public static void main(String[] args) {
        try{
            getInt();
        }
//        catch (Exception e){
//            System.out.println("Its a string of characters takes string of numbers");
//        }
        catch (NumberFormatException  | NullPointerException e){
            System.out.println("Its a string of characters takes string of numbers");
        }
    }
    public static void getInt(){
        int myInt=Integer.parseInt("pants");
    }
}
