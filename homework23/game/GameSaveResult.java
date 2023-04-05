package de.telran.averchenko.elena.homework23.game;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class GameSaveResult implements Serializable {
    String name;
    int winCounter;
    int loseCounter;

    public GameSaveResult(String name, int winCounter, int loseCounter) {
        this.name = name;
        this.winCounter = winCounter;
        this.loseCounter = loseCounter;
    }

    public GameSaveResult() {
    }

    @Override
    public String toString() {
        return "GameSaveResult{" +
                "name='" + name + '\'' +
                ", winCounter=" + winCounter +
                ", loseCounter=" + loseCounter +
                '}';
    }


    public void startTheGame() throws IOException, ClassNotFoundException {
        File results = new File("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\results.txt");
        Scanner scanner = new Scanner(System.in);
        if (results.exists()){
//            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(results));
//            BufferedInputStream bufferedInputStream = new BufferedInputStream( new FileInputStream(results));
//            GameSaveResult res = (GameSaveResult) objectInputStream.readObject();
//            StringBufferInputStream bufferedWriter = new StringBufferInputStream(new FileInputStream("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\results.txt").toString());

            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\results.txt"));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } else if(!results.exists()){
            results.createNewFile();
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(results));
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream( new FileOutputStream(results));
            FileWriter fileWriter = new FileWriter("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\results.txt");
            System.out.println("Please, enter your name: ");
            name = scanner.nextLine();
            loseCounter = 0;
            winCounter = 0;
//            objectOutputStream.writeObject(new GameSaveResult(name, loseCounter, winCounter));
            String res = (new GameSaveResult(name, loseCounter, winCounter)).toString();
            System.out.println(res);
            fileWriter.write(res);
            fileWriter.close();
        }
        Random random = new Random();
        boolean tempRes = random.nextBoolean();
        if (tempRes) {
            winCounter += 1;
        } else if (!tempRes) {
            loseCounter += 1;
        }
        FileWriter fileWriter1 = new FileWriter("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework23\\results.txt");
        fileWriter1.write((new GameSaveResult(name, loseCounter, winCounter)).toString());
        fileWriter1.close();
    }
}
