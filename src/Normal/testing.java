package Normal;

public class testing {
    public static void main(String[] args) {
        help h=new help();
        h.works(2,"rohan");
    }
    public static class hhhh{

    }
}
class help{
    int num;
    String name;
    void works(int num,String name){
        this.num=num;
        this.name=name;
        System.out.println(this.num);
        System.out.println(this.name);
    }
}
