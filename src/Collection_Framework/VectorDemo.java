package Collection_Framework;

import java.util.*;

/*
In vector size is increased by cc*2
Thread safe
 */

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        System.out.println(vector.capacity());
        vector.addElement(90);
        System.out.println(vector.capacity());
//        System.out.println(vector);

        //vector cursor
        Enumeration<Integer> elements = vector.elements();
        while(elements.hasMoreElements()){
            Integer integer=elements.nextElement();
            System.out.println(integer);
        }

        //ArrayList cursor
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //List cursor  //bidirectional
        ListIterator<Integer> integerListIterator = list.listIterator();
        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
    }
}
