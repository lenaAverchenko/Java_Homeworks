package de.telran.averchenko.elena.homework18New.task_three;

public abstract class Student {
    protected String name;
    protected double rate;
    protected boolean finished;
    protected String type;

    // В теории, любой студент что-то делает, поэтому он точно может иметь абстрактный метод - например, учиться.
    // но каждый из студентов разного напрсавления учит разные предметы, поэтому реализация будет разной

    public Student(String name, double rate, boolean finished, String type) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
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

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
