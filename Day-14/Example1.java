import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BasicFileIO {
    public static void main(String[] args) {
        String fileName = "example1.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello World\n");
            writer.write("Java File Handling Example");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
