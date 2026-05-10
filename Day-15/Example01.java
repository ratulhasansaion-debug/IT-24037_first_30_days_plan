import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopy {
    public static void main(String[] args) {
        try {
            FileInputStream source = new FileInputStream("input.dat");
            FileOutputStream destination = new FileOutputStream("output.dat");

            int data;
            while ((data = source.read()) != -1) {
                destination.write(data);
            }

            source.close();
            destination.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
