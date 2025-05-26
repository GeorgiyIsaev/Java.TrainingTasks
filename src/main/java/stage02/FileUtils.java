package stage02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtils {
    private FileUtils(){}
    public static String readText(Path p) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(p.toString()))) {
            String line;

            while((line = br.readLine()) != null) {
                result.append(line);
                result.append('\n');
            }
        } catch (IOException e) {
           throw new IOException(e);
        }
        return result.toString();
    }
}
