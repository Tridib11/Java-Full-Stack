package Normal;

public class StringBufferExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        StringBuffer sb=new StringBuffer("Raj ");
        sb.append("Yadav");

        System.out.println(sb);
        sb.insert(2,123);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.replace(6,11,"hello");
        System.out.println(sb);

    }
}
