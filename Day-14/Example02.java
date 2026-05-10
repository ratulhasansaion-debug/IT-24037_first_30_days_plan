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
