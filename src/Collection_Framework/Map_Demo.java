package Collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args) {
        Map<Integer,String> mapDemo=new HashMap<>();
        mapDemo.put(10,"Raj");
        mapDemo.put(11,"Rohan");
        mapDemo.put(12,"Kavya");
        mapDemo.put(13,"Rahul");
        System.out.println(mapDemo);

        Iterator<Map.Entry<Integer, String>> iterator = mapDemo.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Integer> iterator1 = mapDemo.keySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("-------");
        //java 8 syntax

        mapDemo.keySet().forEach(System.out::println);

    }
}
