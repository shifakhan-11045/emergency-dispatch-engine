import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInputHandler {

    private final CityGraph cityGraph;
    private final Scanner scanner = new Scanner(System.in);
    private final List<Emergency> emergencies = new ArrayList<>();

    public ConsoleInputHandler(CityGraph cityGraph) {
        this.cityGraph = cityGraph;
    }

    public void takeEmergencyInput() {

        System.out.print("Enter Emergency ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Emergency Type (FIRE / MEDICAL / ACCIDENT / CRIME): ");
        EmergencyType type =
                EmergencyType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter Severity (LOW / MEDIUM / HIGH / CRITICAL): ");
        Severity severity =
                Severity.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter Location Name: ");
        String locationName = scanner.nextLine();

        Location location = findLocationByName(locationName);

        if (location == null) {
            System.out.println("❌ Location not found in city map.");
            return;
        }

        Emergency emergency =
                new Emergency(id, type, severity, location);

        emergencies.add(emergency);

        System.out.println("✅ Emergency registered successfully:");
        System.out.println(emergency);
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
