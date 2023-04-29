package de.telran.averchenko.elena.homework20New.task2;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileEditor {
    public FileEditor() {
    }

    public void generateFile(String directoryPath, String filename, String text) {
        File file = new File(directoryPath + File.separator + filename);
        try {
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void workWithString(String s){
        String[] words = s.split(" ");
        Map<String,String> filenames = Arrays.stream(words).collect(Collectors.toMap(t -> t + ".txt", t -> t));
        System.out.println(filenames);
        String nameOfDirectory = "fileEditorTest";
        String directoryPath = "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework20New\\task2\\test\\" + nameOfDirectory;
        File file = new File(directoryPath);
        file.mkdirs();
            List<String> files = filenames.keySet().stream().map((k) -> {
            generateFile(directoryPath,k,filenames.get(k));
            return k;
        }).collect(Collectors.toList());
        System.out.printf("There are %d files have been created!\n", files.size());
    }
}
