package de.telran.averchenko.elena.homework3.worldDirections;

public enum WorldDirection {
    WEST(false,false,false,true),
    EAST(false, true,false,false),
    SOUTH(false,false,true,false),
    NORTH(true,false,false,false);
    private boolean toTheNorth;
    private boolean toTheEast;
    private boolean toTheSouth;
    private boolean toTheWest;

    WorldDirection(boolean toTheNorth, boolean toTheEast, boolean toTheSouth, boolean toTheWest) {
        this.toTheNorth = toTheNorth;
        this.toTheEast = toTheEast;
        this.toTheSouth = toTheSouth;
        this.toTheWest = toTheWest;
    }

    public boolean isToTheNorth() {
        return toTheNorth;
    }

    public boolean isToTheEast() {
        return toTheEast;
    }

    public boolean isToTheSouth() {
        return toTheSouth;
    }

    public boolean isToTheWest() {
        return toTheWest;
    }
    public static void showTheDirection(String direction) {
        switch (direction) {
            case "NORTH" -> System.out.println("We'll go to the North!");
            case "WEST" -> System.out.println("We'll go to the West!");
            case "EAST" -> System.out.println("We'll go to the East!");
            case "SOUTH" -> System.out.println("We'll go to the South!");
            default -> System.out.println("Something went wrong!");
        }
    }
}
