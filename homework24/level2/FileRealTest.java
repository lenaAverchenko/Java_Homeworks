package de.telran.averchenko.elena.homework24.level2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileRealTest {
    public static void main(String[] args) throws IOException {

        //Level 2 Task 4 (4.1 and 4.2)
        BufferedReader reader =new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level2\\fileReal"));
        Pattern pattern = Pattern.compile("<sf:type>(?<name>.+)<.+>");
        Pattern pattern2 = Pattern.compile("<sf:Id>(?<id>.+)<.+>");
        boolean isReady = false;
        while (reader.read() != -1){
            String tempStr = reader.readLine();
            Matcher matcher = pattern.matcher(tempStr);
            Matcher matcher2 = pattern2.matcher(tempStr);
            if (isReady && matcher2.find()){
                System.out.println(matcher2.group("id") + " - the id of PermissionSetAssignment");
                isReady = false;
            }
            if (matcher.find()){
                System.out.println(matcher.group("name"));
                if (matcher.group("name").equals("PermissionSetAssignment")){
                isReady = true;}
            }
        }
        reader.close();



    }
}
