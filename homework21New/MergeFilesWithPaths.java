package de.telran.averchenko.elena.homework21New;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class MergeFilesWithPaths {
    public static void main(String[] args) throws IOException {
        String forPath = "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework21New\\test";
        Path path = Paths.get(forPath);
        Files.createDirectory(path);
        String name = "A B C D";
        String[] names = name.split(" ");
        Arrays.stream(names)
                .forEach(n -> createFiles(forPath,n));

        String resultPath = "C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework21New\\test\\result.txt";
        Files.list(path)
                .map(p -> p.toFile().getAbsolutePath())
                .forEach(s -> getAndWriteContent(resultPath, s));
    }

    public static void createFiles(String absoluteDirPath, String nameOfFile){
        //такое разделение будет работать для Windows, Linux должен быть с корнем "/"
        Path newPath = null;
        if (absoluteDirPath.contains(":")){
            String[] rootSeparatedPath = absoluteDirPath.split(":");
            newPath = Paths.get((rootSeparatedPath[0] + ":"),rootSeparatedPath[1],(nameOfFile +".txt"));
        } else {
            newPath = Paths.get("/",absoluteDirPath.substring(1),(nameOfFile +".txt"));
        }
        try {
            Files.createFile(newPath);
            Files.write(newPath, nameOfFile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getAndWriteContent(String pathOfFileToWrite,String pathOfFileToRead){
        try {
            Files.readAllLines(Paths.get(pathOfFileToRead)).stream()
                    .forEach(s -> {
                        try {
                            Path path = Paths.get(pathOfFileToWrite);
                            if (!Files.exists(path)){
                                Files.createFile(path);
                            }
                                Files.write(path, s.getBytes(), StandardOpenOption.APPEND);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


