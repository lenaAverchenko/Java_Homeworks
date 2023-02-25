package de.telran.averchenko.elena.homework12.users;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class USTest {
    public static void main(String[] args) {

        // Level 2 Task 1

        Map<String,User> usersInfo = new HashMap<>();
        UserService userService = new UserService(usersInfo);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the login");
        String login = scanner.nextLine();
        System.out.println("Please, enter the password");
        String password = scanner.nextLine();
        while(!userService.signIn(login,password)) {
            login = scanner.nextLine();}
        System.out.println(userService.signUp(login,password));
        System.out.println(usersInfo);

        System.out.println("Please, enter the login");
        String login1 = scanner.nextLine();
        System.out.println("Please, enter the password");
        String password1 = scanner.nextLine();
        while(!userService.signIn(login1,password1)) {
            login1 = scanner.nextLine();}
        System.out.println(userService.signUp(login1,password1));
        System.out.println(usersInfo);

        System.out.println("Enter the account.");
        System.out.println("Please, enter the login");
        String login5 = scanner.nextLine();
        System.out.println("Please, enter the password");
        String password5 = scanner.nextLine();
        while(!userService.enterTheAccount(login5,password5)) {
            System.out.println("Please, enter the login");
            login5 = scanner.nextLine();
            System.out.println("Please, enter the password");
            password5 = scanner.nextLine();
            ;}





        // просто для проверки
//        userService.checkThePassword(password);
//        String password1 = scanner.nextLine();
//        userService.checkThePassword(password1);
//        String password2 = scanner.nextLine();
//        userService.checkThePassword(password2);
//        String password3 = scanner.nextLine();
//        userService.checkThePassword(password3);
//        String password4 = scanner.nextLine();
//        userService.checkThePassword(password4);

//        System.out.println("Please, enter the login");
//        String login2 = scanner.nextLine();
//        System.out.println("Please, enter the password");
//        String password2 = scanner.nextLine();
//        while(!userService.signIn(login2,password2)) {
//            login2 = scanner.nextLine();}
//        System.out.println(userService.signUp(login2,password2));
//        System.out.println(usersInfo);
//
//        System.out.println("Please, enter the login");
//        String login3 = scanner.nextLine();
//        System.out.println("Please, enter the password");
//        String password3 = scanner.nextLine();
//        while(!userService.signIn(login3,password3)) {
//            login3 = scanner.nextLine();}
//        System.out.println(userService.signUp(login3,password3));
//        System.out.println(usersInfo);
//
//        System.out.println("Please, enter the login");
//        String login4 = scanner.nextLine();
//        System.out.println("Please, enter the password");
//        String password4 = scanner.nextLine();
//        while(!userService.signIn(login4,password4)) {
//            login4 = scanner.nextLine();}
//        System.out.println(userService.signUp(login4,password4));
//        System.out.println(usersInfo);


    }
}
