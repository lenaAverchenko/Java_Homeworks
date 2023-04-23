package de.telran.averchenko.elena.homework18New.task_three_with_enum;

public class ProjectStudentWithEnum {
    protected String name;
    protected double rate;
    protected String type;

    public ProjectStudentWithEnum(String name, double rate, String type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProjectStudentWithEnum{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type='" + type + '\'' +
                '}';
    }
}
