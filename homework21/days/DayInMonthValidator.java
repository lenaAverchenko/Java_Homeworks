package de.telran.averchenko.elena.homework21.days;

public class DayInMonthValidator {

    public DayInMonthValidator() {
    }

    public void validate(int month, int day) throws NumberOfMonthException, NumberOfDayException {
        if (month < 1 || month > 12) {
            //level 2.1
//            throw new NumberOfMonthException();
//            throw new Error("Invalid input of month value");
            //level 2.2
            throw new Error("Invalid input of month value. You've typed: " + month + ", but the value of the month can only be between 1 and 12");

        }
        String monthName = " ";
        switch (month){
            case 1: monthName = "January";break;
            case 2: monthName = "February";break;
            case 3: monthName = "March";break;
            case 4: monthName = "April";break;
            case 5: monthName = "May";break;
            case 6: monthName = "June";break;
            case 7: monthName = "July";break;
            case 8: monthName = "August";break;
            case 9: monthName = "September";break;
            case 10: monthName = "October";break;
            case 11: monthName = "November";break;
            case 12: monthName = "December";break;
            default:break;

        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        && (day < 1 || day > 31)){
//            throw new NumberOfDayException();
            throw new NumberOfDayException(day, month, "1 and 31.", monthName);
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11)
                && (day < 1 || day > 30)){
//            throw new NumberOfDayException();
            throw new NumberOfDayException(day, month, "1 and 30.", monthName);
        }
        if (month == 2 && (day < 1 || day > 28)){
//            throw new NumberOfDayException();
            throw new NumberOfDayException(day, month, "1 and 28.", monthName);

        }

    }
}
