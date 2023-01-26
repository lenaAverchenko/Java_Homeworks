package de.telran.averchenko.elena.homework3.week;

import java.lang.reflect.Array;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number){
        String todayIs = "";
        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"};
        for(int i = 0; i<dayOfWeek.length; i++){
            if(number == (i+1)){
                todayIs = dayOfWeek[i];

            } else if (number<=0 || number>7){
                System.out.println("Please input a valid number between 1 and 7");
                break;
            }
        }
        return todayIs;


    }
}
