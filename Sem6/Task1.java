/* 
Реализация пятого принципа ООП, принципа инверсии зависимостей (Dependency Inversion Principle, DIP), 
заключается в том, чтобы строить систему таким образом, чтобы высокоуровневые модули не зависели от низкоуровневых модулей, 
а оба типа модулей зависели от абстракций. 

Программа копирует текст из одного файла в другой.
*/

package java_oop.Sem6;

public class Task1 {
    public static void main(String[] args) {
        // Создаем экземпляры FileReader и FileWriter
        FileReaderService fileReader = new TextFileReader();
        FileWriterService fileWriter = new TextFileWriter();

        // Создаем экземпляр FileProcessor
        FileProcessor fileProcessor = new FileProcessor(fileReader, fileWriter);

        // Указываем имена входного и выходного файлов
        String inputFile = "./java_oop/Sem6/input.txt";
        String outputFile = "./java_oop/Sem6/output.txt";

        // Обработка файлов
        fileProcessor.processFiles(inputFile, outputFile);

        System.out.println("File processing completed successfully.");
    }
}
