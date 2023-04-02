package de.telran.averchenko.elena.homework22.task8;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Task9Test {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\MatchRes.txt");
        Scanner scanner = new Scanner(file);
        File tables = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\Tables.txt");
        tables.createNewFile();

        Map<String, Integer> res = new HashMap<>();

        while(scanner.hasNext()){
            Match match = new Match(scanner.nextLine());
            if (res.containsKey(match.firstTeam)){
//                res.get(match.firstTeam).add(match.firstTeamCount);
                int currentVal = res.get(match.firstTeam);
                res.replace(match.firstTeam,currentVal + match.firstTeamCount);
            } else {
//                List<Integer> ints = new ArrayList<>();
//                ints.add(match.firstTeamCount);
                res.put(match.firstTeam, match.firstTeamCount);
            }

            if (res.containsKey(match.secondTeam)){
                int currentVal1 = res.get(match.secondTeam);
                res.replace(match.firstTeam,currentVal1 + match.secondTeamCount);
//                res.get(match.secondTeam).add(match.secondTeamCount);
            }  else {
//                List<Integer> ints = new ArrayList<>();
//                ints.add(match.secondTeamCount);
                res.put(match.secondTeam, match.secondTeamCount);
            }

        }
        System.setOut(new PrintStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework22\\task8\\Tables.txt"));
        System.out.println(res);
//
//        Map<String, Integer> summaryResults = new HashMap<>();
//        Set<String> keys = res.keySet();




    }
}
