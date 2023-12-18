package Recursion;

public class Skip_A_Character {
    public static void main(String[] args) {
//        Skip("","bcahah");
//        System.out.println(Skip1("Bcadhaah"));
//        System.out.println(skipApple("dkfjsbfapplejhgjg"));
        System.out.println(skip_app_not_apple("hgghappndj"));
    }
    static void Skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch=='a'){
            Skip(p,up.substring(1));
        }
        else {
            Skip(p+ch,up.substring(1));
        }
    }
    static String Skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return Skip1(up.substring(1));
        }
        else {
            return ch+Skip1(up.substring(1));
        }
    }

    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }else{
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }
    static String skip_app_not_apple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skip_app_not_apple(s.substring(3));
        }else{
            return s.charAt(0)+skip_app_not_apple(s.substring(1));
        }
    }

}
