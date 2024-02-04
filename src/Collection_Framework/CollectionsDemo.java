package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    /*

    ------------List------------------

    List is an interface that maintains an order
    and allows duplicates
    access in O(1)

    initial capacity=10
    new capacity=(cc*1.5)+1

    Random access - Marker Interface
    it has something called as Random access that helps it to find something
    in O(1) list.find(index)

    Cloneable - Marker Interface
    A class implements the Cloneable interface to indicate to the Object.clone()
    method that it is legal for that method to make a field-for-field copy of
    instances of that class.

    Serializable - Marker Interface

    */

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        System.out.println(list);
    }


}
