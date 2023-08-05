package java_oop.Sem6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader implements FileReaderService {

    @Override
    public String read(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while reading from file: " + filePath);
        }
        return content.toString();
    }
}

