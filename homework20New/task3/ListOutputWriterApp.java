package de.telran.averchenko.elena.homework20New.task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOutputWriterApp {
    public static void main(String[] args) throws IOException {
        //Надеюсь, суть задачи была такова, потому как идей реализации есть много
        List<String> list = new ArrayList<>();
        ListOutputWriter listOutputWriter = new ListOutputWriter(list);
        listOutputWriter.writeWord("Hello!");
        String message = "This is my first experience when I myself work with IO API";
        String[] strings = message.split(" ");
        Arrays.stream(strings)
                .map(str -> {
                    try {
                        listOutputWriter.writeWord(str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    return str;
                }).collect(Collectors.toList());
        System.out.println(list); // простой вывод нашего параметра
        list.stream().forEach(System.out::println); // вывод через Stream API


        //метод write()
        System.out.println("_______________");
        List<String> list1 = new ArrayList<>();
        ListOutputWriter listOutputWriter1 = new ListOutputWriter(list1);
        listOutputWriter1.write(message);
        System.out.println(list1);
        listOutputWriter1.close();

        //Проверка отработанного - закрытого стрима. Должен и выбрасывает исключение
        listOutputWriter1.write("Hello, again!");





    }
}
