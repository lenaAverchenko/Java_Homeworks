package de.telran.averchenko.elena.homework22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ToFileTest {
    public static void main(String[] args) throws IOException {

        // Level 1 Task 7

        File file = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\test.txt");
//        System.out.println(file.createNewFile());
        Scanner scanner = new Scanner(System.in);
        System.setOut(new PrintStream(file));
        for (int i = 0; i < 5; i++) {
            System.out.println(scanner.nextLine());
        }

    }
}
