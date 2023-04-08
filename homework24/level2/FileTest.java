package de.telran.averchenko.elena.homework24.level2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTest {
    public static void main(String[] args) throws IOException {

        //Level 2 Task 3
        //Все выводит, результаты верные но выкидывает исключение, а нулевую строку он может видеть только по причине, что ридер мой
        // съедает первый символ, и строка остается пустой. Не могу понять, почему так.
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.CharSequence.length()" because "this.text" is null
        //Task 3.1


        Pattern pattern = Pattern.compile("(?<name>(.+)):\\s(?<boolean>[false,true])");
            BufferedReader reader = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level2\\file.txt"));
            while (reader.read()!=-1){
                // 1 option
                String temporaryStr = reader.readLine();
//                if ((temporaryStr.contains("true") || temporaryStr.contains("false")) && temporaryStr != null){
//                    String[] tempArrayOfWords = temporaryStr.split(":");
//                    System.out.println("The name of the boolean variable: " + tempArrayOfWords[0]);
//                }
                // 2 option
                Matcher matcher = pattern.matcher(temporaryStr);
                if(matcher.find()){
                    System.out.println("The name of the boolean variable: " +matcher.group("name"));
                }
            }
        reader.close();

//        Task 3.2

        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level2\\file.txt"));
        Pattern pattern1 = Pattern.compile("\\s+.version.:\\s(?<version>(\\d+)),");
        while (reader1.read() != -1){
            String someStr = reader1.readLine();
            Matcher matcher1 = pattern1.matcher(someStr);
            if (matcher1.find()){
                System.out.println(matcher1.group("version"));
            }
        }
        reader1.close();

        //Task 3.3

        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level2\\file.txt"));
        // Все поля (поле - строка, которая начинается с { и заканчивается }), в названии которых есть слово normalizer
        // Дело в том, что такой строки в документе нет)
        //Есть только такие:
        //      "normalizer": {
        //        "lowercase_normalizer": {
        //Для них можно сделать условие, что в конце есть {, и есть слово normalizer

//        Pattern pattern2 = Pattern.compile("^\\{.+normalizer.+\\}$");
        Pattern pattern2 = Pattern.compile(".+normalizer.+\\{$");
        while (reader2.read() != -1){
            String someStr = reader2.readLine();
            Matcher matcher1 = pattern2.matcher(someStr);
            if (matcher1.find()){
                System.out.println(matcher1.group());
            }
        }
        reader2.close();
    }
}
