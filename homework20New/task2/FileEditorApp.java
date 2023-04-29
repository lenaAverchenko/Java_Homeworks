package de.telran.averchenko.elena.homework20New.task2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileEditorApp {
    public static void main(String[] args) {
        // Task 2.1
        FileEditor fileEditor = new FileEditor();
        String text = "This is my first experience when I myself work with IO API";
        fileEditor.generateFile(
                "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework20New\\task2",
                "fileEditorFile.txt", text);

        generateFileStatic(
                "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework20New\\task2",
                "FileStatic.txt", text);

        fileEditor.workWithString(text);
    }

    // если сигнатура принципиальна, можно без редактора файлов
    private static void generateFileStatic(String directoryPath, String filename, String text) {
        File file = new File(directoryPath + File.separator + filename);
        try {
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
