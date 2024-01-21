package CustomException;

public class Main {
    public static void main(String[] args) {
        try{
            vote(12);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }


    public static void vote(int age)throws InValidAgeException{
        if(age<18){
            throw new InValidAgeException("Not eligible for voting");
        }
        else{
            System.out.println("You are eligible");
        }
    }
}
