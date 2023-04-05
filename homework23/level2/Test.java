package de.telran.averchenko.elena.homework23.level2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {

        //Level 2 Task 1
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\MatchRes.txt"));
        int counter = 0;
        try{

            while(bufferedReader.read() != -1){
//                String currentLine = bufferedReader.readLine();
                char[] charsToSearch = bufferedReader.readLine().toCharArray();
                for (int i = 0; i < charsToSearch.length; i++) {
                    if (charsToSearch[i] == ',') {
                        counter +=1;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);

        //Level 2 Task 2
        File fileHundred = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\MatchRes.txt");
        byte[] twoHundred = new byte[200];
        FileInputStream fileInputStream = new FileInputStream(fileHundred);
        fileInputStream.skip(100);
        fileInputStream.read(twoHundred);
        fileInputStream.close();

        FileOutputStream outputStream = new FileOutputStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\res.txt");
        outputStream.write(twoHundred);
        outputStream.close();



        //Level 2 Task 3

        FileInputStream inputStream = new FileInputStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\MatchRes.txt");
        byte[]buffer = new byte[32];
        while (inputStream.read()!= -1) {
            System.out.println(inputStream.read(buffer));
        }
        inputStream.close();

        //Level 2 Task 4

        File someFile = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\SomeFile.txt");
        FileInputStream inputStream1 = new FileInputStream(someFile);
        FileWriter writer = new FileWriter(someFile);
        writer.write("Hello, world!");
        writer.close();
        byte[] bytes = inputStream1.readAllBytes();
        inputStream1.close();
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        FileOutputStream byteWriter = new FileOutputStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\NewFile.txt");
        byteWriter.write(bytes);
        byteWriter.close();


        //Level 2 Task 5

        Map<Character, Integer> statistics = new HashMap<>();
//        FileInputStream inputStreamReader = new FileInputStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\MatchRes.txt");
        FileReader inputReader = new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\MatchRes.txt");

        while(inputReader.read() != -1){
            char tempChar = (char) inputReader.read();
            if (!statistics.containsKey(tempChar)){
                statistics.put(tempChar, 1);
            } else if (statistics.containsKey(tempChar)) {
                int oldVal = statistics.get(tempChar);
                statistics.replace(tempChar, oldVal, oldVal+1);
            }
        }
        inputReader.close();
        FileWriter fileWriter = new FileWriter("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\level2\\Symbols.txt");
        fileWriter.write(statistics.toString());
        fileWriter.close();





    }

    }





