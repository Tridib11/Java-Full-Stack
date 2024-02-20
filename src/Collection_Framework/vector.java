package Collection_Framework;

import java.util.Vector;
//Thread safe
//default size=10
// new capacity =10*2
public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());
        for (int i = 0; i < 10; i++) {
            vector.addElement(i);
        }
        System.out.println(vector.capacity());
        vector.add(90);
        System.out.println(vector.capacity());

    }
}
