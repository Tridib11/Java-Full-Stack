package StaticExample;
public class InnerClasses {
    /*
    Inner classes can be static but the outer classes cannot be static
     */
  static class Test{
//        static String name;
        String name;
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test a =new Test("Tridib");
        Test b=new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
