package EXCEPTION_HANDLING_BROCODE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Enter a whole number to divide");
            int x=sc.nextInt();
            System.out.println("Enter a whole number to divide by");
            int y=sc.nextInt();
            int z=x/y;
            System.out.println("result : "+z);
        }
//        catch (Exception e){
//            System.out.println("can't divide by zero");
//        }
        catch (ArithmeticException e){
            System.out.println("can't divide");
        }

        catch (InputMismatchException e){
            System.out.println("Divide it with a number !!");
        }
//        finally {
//            System.out.println("This will be called always");
//        }
        finally{
            sc.close();
        }
    }
}
