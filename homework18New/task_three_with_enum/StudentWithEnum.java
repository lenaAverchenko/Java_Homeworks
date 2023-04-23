package de.telran.averchenko.elena.homework18New.task_three_with_enum;

public abstract class StudentWithEnum {
    protected String name;
    protected double rate;
    protected boolean finished;
    protected Type type;

    public StudentWithEnum(String name, double rate, boolean finished, Type type) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
