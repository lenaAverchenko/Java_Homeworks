package de.telran.averchenko.elena.homework24.level2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailTest {
    public static void main(String[] args) {

        //Level 1 Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the e-mail: ");
        String mail = scanner.nextLine();
//        Pattern mailPattern = Pattern.compile("(\\w+\\d+?\\.?){0,30}@(\\w+\\d+?\\.?){0,10}\\.(\\w+){2,4}");
        Pattern mailPattern = Pattern.compile("^[a-zA-Z0-9.]{0,30}@([a-zA-Z0-9.]+\\.)[a-zA-Z]{2,4}$");
        Matcher matcher = mailPattern.matcher(mail);
        if (matcher.find()){
            System.out.println("The e-mail is valid");
        } else{
            System.out.println("The e-mail is invalid");
        }

    }
}
