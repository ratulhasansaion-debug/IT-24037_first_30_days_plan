import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayExample {
    public static void main(String[] args) {
        String data = "Byte Stream Data";
        byte[] bytes = data.getBytes();

        try {
            FileOutputStream out = new FileOutputStream("test.bin");
            out.write(bytes);
            out.close();

            FileInputStream in = new FileInputStream("test.bin");
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            
            System.out.println(new String(buffer));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
