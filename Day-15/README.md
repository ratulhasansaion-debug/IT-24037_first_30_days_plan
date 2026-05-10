# Example 1: Copying a File (Byte by Byte)
```java
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
```
# Example 2: Writing and Reading a Byte Array
```java
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
```
