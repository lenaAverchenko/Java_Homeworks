package de.telran.averchenko.elena.homework15.database;

public class Person {
    private String name;
    private String surname;
    private final Sex sex;
    private final int yearOfBirth;
    private  String jobTitle;

    public Person(String name, String surname, Sex sex, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Sex getSex() {
        return sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", yearOfBirth=" + yearOfBirth +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
