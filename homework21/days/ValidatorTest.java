package de.telran.averchenko.elena.homework21.days;

import java.util.Scanner;

public class ValidatorTest {
    public static void main(String[] args) throws NumberOfMonthException, NumberOfDayException {

        // Level 2 Task 1 and Task 2

        DayInMonthValidator dayInMonthValidator = new DayInMonthValidator();

//        dayInMonthValidator.validate(5,31);
//        dayInMonthValidator.validate(15,31);
//        dayInMonthValidator.validate(7,32);
//        dayInMonthValidator.validate(4,-1);
//        dayInMonthValidator.validate(6,31);
//        dayInMonthValidator.validate(2,30);



        // Данные можно передавать из консоли
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter the month number: ");
            int month = scanner.nextInt();
            System.out.println("Please, enter the day number: ");
            int day = scanner.nextInt();

            dayInMonthValidator.validate(month,day);

        }



    }
}
