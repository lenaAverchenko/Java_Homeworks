package de.telran.averchenko.elena.homework22New;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your e-mail:");
        String usersMail = scanner.nextLine();
        while (!"exit".equals(usersMail)){
            isValid(usersMail);
            System.out.println("Enter your e-mail:");
            usersMail = scanner.nextLine();
        }
        scanner.close();
    }

    public static void isValid(String mail){
        //olena@gmail.com - пример - бесконечным имя пользователя быть не может, пусть будет от 1 знака до 30 (до @).
        // После @ аналогично, но тут уже не ограничивала
        String regex = "^[a-zA-Z0-9.]{1,30}@([a-zA-Z])+\\.[a-zA-Z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(mail).matches()){
            System.out.println("The e-mail is valid!");
        } else {
            System.out.println("The e-mail is invalid!");
        }
    }
}
