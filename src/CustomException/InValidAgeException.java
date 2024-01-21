package CustomException;

public class InValidAgeException extends Exception{
    InValidAgeException(String msg){
        System.out.println(msg);
    }
}
