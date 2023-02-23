package de.telran.averchenko.elena.homework11.hospital;

public class Patient {
    private String name;


    public Patient(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                '}';
    }
}
