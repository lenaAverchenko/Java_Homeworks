package de.telran.averchenko.elena.homework23;

import java.io.*;

public class Level1 {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\verse.txt");
        File file1 = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\rewritten.txt");

//        readTheString(file);
        writeTheString(file,file1);


    }

    // Level 1 Task 9
    //"лександр Пушкин — Бесы: Стих" - в каждой строке съедает первую букву, а если while убрать, то выводит одну строку, но нормально
    public static void readTheString(File file) throws IOException {
       BufferedReader reader = new BufferedReader(new FileReader(file));
       while (reader.read() != -1){
           String str = reader.readLine();
           System.out.println(str);
       }
        reader.close();
    }
    // Level 1 Task 10
    public static void writeTheString(File file, File file1) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.read() != -1){
            String str = reader.readLine();
            writer.write(str + "\n");
        }
        reader.close();
        writer.close();
    }
}
