package de.telran.averchenko.elena.homework22New;

import java.util.regex.Pattern;

public class RegExIp {
    public static void main(String[] args) {

        String ip1 = "000.14.33.156";
        System.out.println(isValidIp(ip1));

        String ip2 = "0.0.0.0";
        System.out.println(isValidIp(ip2));

        String ip3 = "00.1.23.23.23";
        System.out.println(isValidIp(ip3));

        String ip4 = "i.am.not.an.ip";
        System.out.println(isValidIp(ip4));

    }
    public static boolean isValidIp(String ip){
        String regDigit ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = regDigit + "\\." + regDigit + "\\." + regDigit + "\\." + regDigit;

        // работает:
        // На самом деле, не хватало скобок, потому как без них мы сложили 2 строки, но по итогу
        // 3 повторения делали только на экранированную точку)
        String regexNew = ("(" + regDigit + "\\.)") + "{3}" + regDigit;

        // работает, и проще, вероятно, написать без дополнительных переменных:
        String regDigitNew ="((\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        Pattern pattern = Pattern.compile(regDigitNew);
        return pattern.matcher(ip).matches();
    }
}
