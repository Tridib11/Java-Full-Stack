package FILE_HANDLING.FILE_OPERATIONS;

import java.io.FileWriter;
import java.io.IOException;

public class Write_to_a_file {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("test.txt");
            writer.write("Opperation performed successfully");
            System.out.println("Operation successfull");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
