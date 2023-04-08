package de.telran.averchenko.elena.homework24.level1;

import de.telran.averchenko.elena.homework22.task8.Match;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTest {
    public static void main(String[] args) {

        // Level 1 Task 11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the password: ");
        String password = scanner.nextLine();
        Pattern patternLowerCase = Pattern.compile("[a-z]");
        Pattern patternUpperCase = Pattern.compile("[A-Z]");
        Pattern patternNumbers = Pattern.compile("\\d");
        //!"#$%&'()*+,-./:;<=>?@[\]^_{|}~
        Pattern patternSpecialSymbols = Pattern.compile("[!\"#$%&'()*+,-./:;<=>?@\\[\\\\\\]^_{|}~]");

        Matcher matcherLC = patternLowerCase.matcher(password);
        Matcher matcherUC = patternUpperCase.matcher(password);
        Matcher matcherN = patternNumbers.matcher(password);
        Matcher matcherSS = patternSpecialSymbols.matcher(password);


        if(matcherLC.find() && matcherUC.find() && matcherN.find() && matcherSS.find() && password.length()>=8){
            System.out.println("The password is ok");
        } else {
            System.out.println("The password is not correct. Please, make sure, that you've used at least one letter in lower case? one - in upper case, one number and a special symbol. The password is valid only if there are at least 8 symbols.");
            }

    }
}
