package FILE_HANDLING;
import java.io.File;
public class FileFinding {
    public static void main(String[] args) {
        File file=new File("lol.txt");
        if(file.exists()){
            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else{
            System.out.println("File doesnot exit");
        }
    }

}
