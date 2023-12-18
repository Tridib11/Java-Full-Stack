package Recursion;

import java.util.ArrayList;

public class Maze {
    static int pathCount = 0;
    public static void main(String[] args) {
        System.out.println(count(3,3));
        paths("",3,3);
        System.out.println(returninArrayList("",3,3));
        System.out.println(goDiagonal("",3,3));
    }
    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static void paths(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            paths(p+'D',r-1,c);
        }
        if(c>1){
            paths(p+'R',r,c-1);
        }
    }
    static ArrayList<String> returninArrayList(String p,int r,int c){
        ArrayList<String> list=new ArrayList<>();
        if(r==1 && c==1){
            list.add(p);
            return list;
        }
        if(r>1){
            list.addAll(returninArrayList(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(returninArrayList(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String> goDiagonal(String p,int r,int c){
        ArrayList<String> list=new ArrayList<>();
        if(r==1 && c==1){
            list.add(p);
            return list;
        }
        if(r>1 && c>1){
            list.addAll(goDiagonal(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(goDiagonal(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(goDiagonal(p+'H',r,c-1));
        }
        return list;
    }
}
