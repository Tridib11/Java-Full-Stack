package FILE_HANDLING.FILE_OPERATIONS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_a_file {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("test.txt");
            int data=reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data=reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
