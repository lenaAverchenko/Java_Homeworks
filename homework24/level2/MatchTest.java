package de.telran.averchenko.elena.homework24.level2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTest {
    public static void main(String[] args) throws IOException {

        // Level 2 Task 1
        BufferedReader reader = new BufferedReader(new FileReader("C:\\JavaProjects\\Java\\Lessons\\January\\java-prof-1\\src\\de\\telran\\averchenko\\elena\\homework24\\level1\\MatchRes.txt"));
//        Pattern pattern = Pattern.compile("(\\d){1,4}(,\\s\\d{1,2}){2},\\s(.+),\\s(\\d{1,2}:\\d{1,2}),\\s(.+),\\s(.+),\\s(.+)");
        Pattern pattern = Pattern.compile("\\d{4},\\s\\d{1,2},\\s\\d{1,2},\\s[a-zA-Z0-9.\\s]+,\\s\\d{1,2}:\\d{1,2},\\s[a-zA-Z0-9\\s],\\s[\\d,NULL]+,\\s.+");


 /*
 *
 * 2022, 1, 8, TSG 1899 Hoffenheim, 3:1, FC Augsburg, 500, NULL
 * 4 знака цифры - \\d{4}
 * , и проблел периодически повторяются - ,\\s
 *  1 или 2 цифры  - \\d{1,2} - это повторится 2 раза вместе с запятой и пробелом: (,\\s\\d{1,2}){2}
 * потом идет группа, где могут быть цифры, буквы, пробел - любой символ, считай, который может встретиться 1 и более раз - (.+)
 * сам счет - цифры от 1 до 2 через знак двоеточия - \\d{1,2}:\\d{1,2}
 * снова идет любой сивмол произвольное число раз - .+
 * число либо нал - ([\\d,NULL]+), либо любой символ
 * любой сивмол произвольное число раз - .+
 * конец строки, либо перенос строки - $ либо \\n либо \\r\\n
  *
 *
 * */
        //TODO
        //Буду благодарна, если подскажете, почему ридер съедает мне первый знак, и выдает:
        // "022, 1, 8, TSG 1899 Hoffenheim, 3:1, FC Augsburg, 500, NULL"
        //По этой причине очень долго не могла понять, почему строка не воспринимается, а проблема была в том, что я говорю
        // "там 4 цифры", а он их видит меньше. Заработало, когда поменяла на \\d{1,4}


        // Ниже костыль, конечно, но, если не делить на группы, всегда будет работать, и выведет любую строку)))
        Pattern pattern1 = Pattern.compile(".+");
        while (reader.read() !=-1){
            String tempString = reader.readLine();
//            Matcher matcher1 = pattern1.matcher(tempString);
            Matcher matcher = pattern.matcher(tempString);
            if (matcher.find()){
                System.out.println(matcher.group());
//                System.out.println(matcher1.group());

            }
        }
        reader.close();
    }
}
