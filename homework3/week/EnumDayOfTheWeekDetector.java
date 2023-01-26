package de.telran.averchenko.elena.homework3.week;

import de.telran.averchenko.elena.classwork3.enums.Month;

public class EnumDayOfTheWeekDetector implements DayOfTheWeekDetector {


    @Override
    public String detectDayName(int number) {

        if (number == 1) {
            return DaysOfWeek.MONDAY.toString();
        } else if (number == 2) {
            return DaysOfWeek.TUESDAY.toString();
        } else if (number == 3) {
            return DaysOfWeek.WEDNESDAY.toString();
        } else if (number == 4) {
            return DaysOfWeek.THURSDAY.toString();
        } else if (number == 5) {
            return DaysOfWeek.FRIDAY.toString();
        } else if (number == 6) {
            return DaysOfWeek.SATURDAY.toString();
        } else if (number == 7) {
            return DaysOfWeek.SUNDAY.toString();
        } else {
            return "Please input a valid number between 1 and 7";
        }

    }
    public DaysOfWeek detectDayNameEnum(int number){
        DaysOfWeek[] days = DaysOfWeek.values();
        DaysOfWeek todayIsTheDay = null;
        for(int i = 0; i<days.length; i++) {
            if (number == (i + 1)) {
                todayIsTheDay = days[i];
            } else if (number <= 0 || number > 7) {
                System.out.println("Please input a valid number between 1 and 7");
                break;
            }
        }
        return todayIsTheDay;


    }
}


