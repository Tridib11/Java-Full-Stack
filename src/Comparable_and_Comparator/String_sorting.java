package Comparable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class String_sorting {
    public static void main(String[] args) {
        ArrayList<String> musicList=new ArrayList<>();
        musicList.add("zara zara");
        musicList.add("besabriyan");
        musicList.add("kaise hua");
        musicList.add("aeisa desh he mera");
        musicList.add("koi lauta do wo pyare pyare din");

        iterateList(musicList);
        System.out.println("---------------");
//        Collections.sort(musicList, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(musicList);
        iterateList(musicList);

    }

    private static void iterateList(ArrayList<String> musicList) {
        for(String temp: musicList){
            System.out.println(temp);
        }
    }
}
