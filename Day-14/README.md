#Example 1: Basic File Read and Write (IO Package)
---
```java
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
```
---
#Example 2: Modern File Handling (NIO Package)
```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;

public class ModernFileIO {
    public static void main(String[] args) {
        Path path = Paths.get("example2.txt");
        String content = "New NIO Approach\nData persistence test";

        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE);

            List<String> lines = Files.readAllLines(path);
            for (String str : lines) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
