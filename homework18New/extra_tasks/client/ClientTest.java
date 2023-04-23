package de.telran.averchenko.elena.homework18New.extra_tasks.client;

import java.util.*;
import java.util.stream.Collectors;

public class ClientTest {
    public static void main(String[] args) {
        /**
         Необходимо создать класс клиента со следующими полями: уникальный идентификатор, имя, возраст.
         Также у клиента есть список телефонов. Класс телефона содержит само значение и тип
         (стационарный или мобильный).
         Найти самого возрастного клиента, которой пользуется стационарным телефоном */

        List<Client> clients = Arrays.asList(new Client(1, "Oleh", 29, List.of(new Phone("+4802656596", "home"), new Phone("+3569852563", "cellular"))),
                new Client(1, "Mania", 60, List.of(new Phone(null, "home"), new Phone("+3895626216", "cellular"))),
                new Client(1, "Kolia", 30, List.of(new Phone(null, "home"), new Phone("+3125145663", "cellular"))),
                new Client(1, "Tolik", 54, List.of(new Phone("+7859625633", "home"), new Phone("+9632255812", "cellular"))),
                new Client(1, "Nastia", 12, List.of(new Phone(null, "home"), new Phone("+8626633263", "cellular"))),
                new Client(1, "Zina", 22, List.of(new Phone("+4459625632", "home"), new Phone("+45266963263", "cellular"))));

        System.out.println(Objects.requireNonNull(clients.stream()
                .filter(cl -> cl.getPhoneList().stream()
                        .anyMatch(c -> c.getNumber() != null && c.getType().equals("home")))
                .max(new ClientAgeComparator()).orElse(null)).toString());

    }
}
