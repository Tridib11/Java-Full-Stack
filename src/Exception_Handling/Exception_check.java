
package Exception_Handling;

public class Exception_check  {
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        try{
            System.out.println("HEy man sup");
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("AOo bhai exceptio");
            //e.printStackTrace();//L+D+E
            //e.getMessage() Description
            //e.toString() Error name
            //e.getCause() if no cause then returns null
            System.out.println(e.toString());
        }
    }
}
