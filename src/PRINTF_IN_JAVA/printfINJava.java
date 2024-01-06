package PRINTF_IN_JAVA;

public class printfINJava {
    public static void main(String[] args) {
        boolean myBoolean=true;
        char myChar='@';
        String myString="Bro";
        int myInt=50;
        double myDouble=1000;
        System.out.printf("%b",myBoolean);
        System.out.println();
        System.out.printf("%c",myChar);
        System.out.println();
        System.out.printf("%s",myString);
        System.out.println();
        System.out.printf("%d",myInt);
        System.out.println();
        System.out.printf("%f",myDouble);
        System.out.println();
        System.out.printf("Hello %10s",myString);
        System.out.println();
        System.out.printf("You have this much money %.2f",myDouble);
    }
}
