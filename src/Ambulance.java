public class Ambulance {

    private final String id;
    private Location currentLocation;
    private boolean available;

    public Ambulance(String id, Location location) {
        this.id = id;
        this.currentLocation = location;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignEmergency(Location newLocation) {
        this.currentLocation = newLocation;
        this.available = false;
    }

    public void completeEmergency() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Ambulance{id='" + id + "', location=" +
                currentLocation.getName() +
                ", available=" + available + "}";
    }
}