package de.telran.averchenko.elena.homework3.worldDirections;

public class TestWorldDirections {
    public static void main(String[] args) {

        System.out.println(WorldDirection.NORTH);
        System.out.println(WorldDirection.WEST);
        System.out.println(WorldDirection.EAST);
        System.out.println(WorldDirection.SOUTH);

        System.out.println("__________");
        System.out.println("North");
        System.out.println(WorldDirection.NORTH.isToTheNorth());
        System.out.println(WorldDirection.NORTH.isToTheWest());
        System.out.println(WorldDirection.NORTH.isToTheEast());
        System.out.println(WorldDirection.NORTH.isToTheSouth());

        System.out.println("__________");
        System.out.println("West");
        System.out.println(WorldDirection.WEST.isToTheNorth());
        System.out.println(WorldDirection.WEST.isToTheWest());
        System.out.println(WorldDirection.WEST.isToTheEast());
        System.out.println(WorldDirection.WEST.isToTheSouth());

        System.out.println("__________");
        System.out.println("East");
        System.out.println(WorldDirection.EAST.isToTheNorth());
        System.out.println(WorldDirection.EAST.isToTheWest());
        System.out.println(WorldDirection.EAST.isToTheEast());
        System.out.println(WorldDirection.EAST.isToTheSouth());

        System.out.println("__________");
        System.out.println("South");
        System.out.println(WorldDirection.SOUTH.isToTheNorth());
        System.out.println(WorldDirection.SOUTH.isToTheWest());
        System.out.println(WorldDirection.SOUTH.isToTheEast());
        System.out.println(WorldDirection.SOUTH.isToTheSouth());

        System.out.println("__________");
        WorldDirection.showTheDirection("NORTH");
        WorldDirection.showTheDirection("WEST");
        WorldDirection.showTheDirection("EAST");
        WorldDirection.showTheDirection("SOUTH");
        WorldDirection.showTheDirection("something else");
    }
}
