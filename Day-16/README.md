# Writing Data to a File
```java
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
```
# Reading Data from a File
```java
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("output.bin")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
