package de.telran.averchenko.elena.homework21New;

import java.io.*;
import java.util.Arrays;

public class MergeFiles {
    public static void main(String[] args) throws IOException {
        //Не знаю, правильно ли поняла задание. Но этот код работает

        String path = "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework21New\\test";
        File directory = new File(path);
        directory.mkdir();
        String name = "A B C D";
        String[] names = name.split(" ");
        Arrays.stream(names).forEach(n -> createFiles(path,n));


        String result = "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework21New\\test\\result.txt";
        File[] files = directory.listFiles();
        try(Writer writer = new FileWriter(result)) {
            Arrays.stream(files).forEach(f -> getAndWriteContent(writer,f));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFiles(String directory, String nameOfFile){
        File file = new File(directory + File.separator + nameOfFile + ".txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(nameOfFile);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getAndWriteContent(Writer writer, File fileToRead){
        try(FileReader fileReader = new FileReader(fileToRead)) {
            int read;
            while ((read = fileReader.read()) != -1) {
                writer.write(read);}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


