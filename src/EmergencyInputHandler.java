import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmergencyInputHandler {

    private final List<Emergency> emergencies = new ArrayList<>();
    private final CityGraph cityGraph;

    public EmergencyInputHandler(CityGraph cityGraph) {
        this.cityGraph = cityGraph;
    }

    public void takeEmergencyInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Emergency ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Emergency Type (FIRE, MEDICAL, ACCIDENT, CRIME): ");
            EmergencyType type = EmergencyType.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Enter Severity (LOW, MEDIUM, HIGH, CRITICAL): ");
            Severity severity = Severity.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Enter Location Name: ");
            String locationName = sc.nextLine();

            Location location = findLocationByName(locationName);

            if (location == null) {
                System.out.println("❌ Location not found in city map.");
                return;
            }

            Emergency emergency = new Emergency(id, type, severity, location);
            emergencies.add(emergency);

            System.out.println("✅ Emergency registered successfully.");
            System.out.println(emergency);
        }
    }

    private Location findLocationByName(String name) {
        for (Location loc : cityGraph.getAdjacencyList().keySet()) {
            if (loc.getName().equalsIgnoreCase(name)) {
                return loc;
            }
        }
        return null;
    }

    public List<Emergency> getEmergencies() {
        return emergencies;
    }
}
