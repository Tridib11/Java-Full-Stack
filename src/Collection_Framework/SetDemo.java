package Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        /*
        Not a order wise usecase
        duplicates are not allowed
         */
        Set<Integer> set=new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
        System.out.println(set.remove(30));
        System.out.println(set);


    }
}
