package com.emergency.engine;

public class Road {
    private final Location from;
    private final  Location to;
    private final int distance;

    public Road(Location from, Location to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public int getDistance() {
        return distance;
    }
}
