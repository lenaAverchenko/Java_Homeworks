package de.telran.averchenko.elena.homework3.week;


import java.util.Scanner;

public class TestDayOfTheWeekDetector {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Day Of The Week Detector Switch Version");
        int firstNumber = scanner.nextInt();
        System.out.println(dayOfTheWeekDetectorSwitchVersion.detectDayName(firstNumber));
        System.out.println("Day Of The Week Detector If Version");
        int secondNumber = scanner.nextInt();
        System.out.println(dayOfTheWeekDetectorIfVersion.detectDayName(secondNumber));
        System.out.println("Day Of The Week Detector Array Version");
        int thirdNumber = scanner.nextInt();
        System.out.println(dayOfTheWeekDetectorArrayVersion.detectDayName(thirdNumber));

        EnumDayOfTheWeekDetector enumDayOfTheWeekDetector = new EnumDayOfTheWeekDetector();
        System.out.println("Enum Day Of The Week Detector");
        int fourthNumber = scanner.nextInt();
        System.out.println(enumDayOfTheWeekDetector.detectDayName(fourthNumber));
        System.out.println(enumDayOfTheWeekDetector.detectDayNameEnum(fourthNumber));



    }
}
