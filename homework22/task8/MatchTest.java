package de.telran.averchenko.elena.homework22.task8;

import de.telran.averchenko.elena.classwork22.MatchResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\MatchRes.txt");
        Scanner scanner = new Scanner(file);


        // выведет в консоль, если не будем менять вывод на файл
//        while (scanner.hasNextLine()){
//               System.out.println(new Match(scanner.nextLine()));
//            }
//

        File fileFC = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\Augsburg.txt");
//        fileFC.createNewFile();

        System.setOut(new PrintStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\Augsburg.txt"));
        while (scanner.hasNextLine()){
            String nextStr = scanner.nextLine();
            Match match = new Match(nextStr);
            Match matchCurrent = match.getTeamResults(match,"FC Augsburg");
            if (matchCurrent != null){
                System.out.println(matchCurrent);
            }

        }
        Scanner scanner1 = new Scanner(file);
        System.out.println("_________________________________");
        while (scanner1.hasNextLine()){
            String nextStr = scanner1.nextLine();
            Match match = new Match(nextStr);
            Match matchCurrent = match.getResultsByStadium(match,"Mercedes-Benz Arena");
            if (matchCurrent != null){
                System.out.println(matchCurrent);
            }

        }
        Scanner scanner2 = new Scanner(file);

        File winners = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\Winners.txt");
//        winners.createNewFile();

        System.setOut(new PrintStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\Winners.txt"));

        while (scanner2.hasNext()){
            System.out.println(new Match(scanner2.nextLine()).getWinner());
        }




    }
}
