package de.telran.averchenko.elena.homework11.hospital;

public class Prescription {
    private String decease;
    private  String action;

    public Prescription(String decease, String action) {
        this.decease = decease;
        this.action = action;
    }

    public String getDecease() {
        return decease;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "decease='" + decease + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
