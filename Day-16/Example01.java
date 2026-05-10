import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String data = "Processing binary data stream.";
        
        try (FileOutputStream fos = new FileOutputStream("output.bin")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data successfully written.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
