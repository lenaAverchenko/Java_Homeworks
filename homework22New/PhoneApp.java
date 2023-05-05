package de.telran.averchenko.elena.homework22New;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneApp {
    public static void main(String[] args) {

        String phone1 = "11213654";
        String phone2 = "afshdja";
        String phone3 = "1234567";
        String phone4 = "123 4567";
        String phone5 = "12345 67";

        System.out.println(numberIsValid(phone1));
        System.out.println(numberIsValid(phone2));
        System.out.println(numberIsValid(phone3));
        System.out.println(numberIsValid(phone4));
        System.out.println(numberIsValid(phone5));
        System.out.println("_____________________");

        String phone6 = "+48 123 567 000";
        String phone7 = "+48032312458";
        String phone8 = "+4803231245812";
        String phone9 = "+4 803 231 2458";

        System.out.println(numberIsValidAnotherOne(phone6));
        System.out.println(numberIsValidAnotherOne(phone7));
        System.out.println(numberIsValidAnotherOne(phone8));
        System.out.println(numberIsValidAnotherOne(phone9));
    }

    public static boolean numberIsValid(String number){
        String regex = "\\d{7}|(\\d{3}\\s\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static boolean numberIsValidAnotherOne(String number){
        //+48 152 125 126 or +48123456789 - the other pattern
        String regexTwo = "(\\+\\d{2}(\\s\\d{3}){3})|(\\+\\d{11})";
        Pattern pattern = Pattern.compile(regexTwo);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
