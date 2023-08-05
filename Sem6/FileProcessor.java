package java_oop.Sem6;

public class FileProcessor {
    private FileReaderService fileReader;
    private FileWriterService fileWriter;

    public FileProcessor(FileReaderService fileReader, FileWriterService fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public void processFiles(String inputFile, String outputFile) {
        // Читаем данные из входного файла
        String content = fileReader.read(inputFile);

        // Записываем данные в выходной файл
        fileWriter.write(outputFile, content);
    }
}

