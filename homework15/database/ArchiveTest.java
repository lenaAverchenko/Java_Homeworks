package de.telran.averchenko.elena.homework15.database;

public class ArchiveTest {

    public static void main(String[] args) {

        //Level 1 Task 6

        Archive archive = new Archive();

        Person person1 = new Person("Oleh", "Olehov", Sex.MALE, 1989,"manager");
        Person person2 = new Person("Olha", "Olehovna", Sex.FEMALE, 1959,"teacher");
        Person person3 = new Person("Nina", "Tuvim", Sex.FEMALE, 1960,"director");
        Person person4 = new Person("Tolik", "Dzyga", Sex.MALE, 1973,"manager");
        Person person5 = new Person("Olek", "Bondarenko", Sex.MALE, 1995,"manager");
        Person person6 = new Person("Tina", "Bogdanova", Sex.FEMALE, 2002,"teacher");
        Person person7 = new Person("Masha", "Shevchenko", Sex.FEMALE, 1969,"manager");
        Person person8 = new Person("Jakub", "Suvorov", Sex.MALE, 1999,"teacher");
        Person person9 = new Person("Kasia", "Kushnar", Sex.FEMALE, 2003,"director");
        Person person10 = new Person("Alex", "Alexov", Sex.MALE, 1996,"teacher");
        Key key1 = new Key(1, person1);
        archive.archiveOfWorkers.put(key1, person1);
        archive.archiveOfWorkers.put(new Key(2, person2), person2);
        archive.archiveOfWorkers.put(new Key(3, person3), person3);
        archive.archiveOfWorkers.put(new Key(4, person4), person4);
        archive.archiveOfWorkers.put(new Key(5, person5), person5);
        archive.archiveOfWorkers.put(new Key(6, person6), person6);
        archive.archiveOfWorkers.put(new Key(7, person7), person7);
        archive.archiveOfWorkers.put(new Key(8, person8), person8);
        archive.archiveOfWorkers.put(new Key(9, person9), person9);
        archive.archiveOfWorkers.put(new Key(10, person10), person10);
        System.out.println(archive.archiveOfWorkers);

    }

}
