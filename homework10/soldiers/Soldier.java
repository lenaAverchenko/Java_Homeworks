package de.telran.averchenko.elena.homework10.soldiers;

import de.telran.averchenko.elena.classwork10.Cat;

import java.util.Objects;

public class Soldier implements Comparable<Soldier>{

    // Уровень 1 задание 5

    private double height;

    public Soldier(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Рабочике оба варианта

//    @Override
//    public int compareTo(Soldier o) {
//        if(this.getHeight() > o.getHeight()) {
//            return 1;
//        }
//        else if(this.getHeight() < o.getHeight()) {
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Soldier o) {
            return Double.compare(this.height, o.height);
    }



    @Override
    public String toString() {
        return "Soldier{" +
                "height=" + height +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return Double.compare(soldier.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }
}
