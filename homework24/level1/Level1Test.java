package de.telran.averchenko.elena.homework24.level1;

import java.io.*;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level1Test {
    public static void main(String[] args) throws IOException {

        // Level 1 Task 10

        BufferedReader reader = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level1\\MatchRes.txt"));
        Pattern pattern = Pattern.compile("\\b\\w+\\s\\w+\\b"); //
        // \w+ - последовательность символов (слово); \b - граница слова; \s - пробел

        while (reader.read() !=-1){
            String[] tempStringItems = reader.readLine().split(",");
            Matcher matcher = pattern.matcher(tempStringItems[3]);
            if (matcher.find()){
            System.out.println(matcher.group());}
        }
        reader.close();

        // Level 1 Task 12
        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level1\\MatchRes.txt"));

        StringBuilder stringBuilder = new StringBuilder();
        while (reader1.read() !=-1){
            stringBuilder.append(reader1.readLine());
        }
        System.out.println(stringBuilder);
        reader1.close();

        // Level 1 Task 13

        String str = "Carrot Collapse /\\ Criteria, Avatar. Sort][Cabbage";
        // так не работает
//        Pattern patternStr = Pattern.compile("^C\\w*[t,e]$");
        Pattern patternStr = Pattern.compile("\\bC\\w*[t,e]\\b");
        Matcher matcher = patternStr.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Level 1 Task 14
        Pattern patternSymbols = Pattern.compile("[^[a-zA-Z]]");
        Matcher matcherSymbols = patternSymbols.matcher(str);
        while (matcherSymbols.find()){
            System.out.println("The position of symbol " + matcherSymbols.group() + " is: " + matcherSymbols.start());
        }

        // Level 1 Task 15

        String binaryString = "01111000201010101701";
        Pattern binaryPattern = Pattern.compile("[^0,1]");
        Matcher biMatcher = binaryPattern.matcher(binaryString);
        boolean isBinary = true;
        while (biMatcher.find()){
            isBinary = false;
            System.out.println("Ошибка. Обнаружено число: " + biMatcher.group() + " на позиции: " + biMatcher.start());
        }
        if (!isBinary){
            System.out.println("Число не является бинарным представлением");
        } else {
            System.out.println("Число является бинарным представлением");
        }

    }




}
