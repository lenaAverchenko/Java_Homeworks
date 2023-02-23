package de.telran.averchenko.elena.homework11.hospital;

public class Hospital {
    private Doctor doctor;
    private Registration registratory;

    public Hospital(Doctor doctor, Registration registratory) {
        this.doctor = doctor;
        this.registratory = registratory;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Registration getRegistratory() {
        return registratory;
    }
}
