import java.util.Scanner;

public class ConsoleInputHandler {

    private final CityGraph cityGraph;
    private final Scanner scanner;
    private final EmergencyManager emergencyManager;

    public ConsoleInputHandler(CityGraph cityGraph,
                               Scanner scanner,
                               EmergencyManager emergencyManager) {
        this.cityGraph = cityGraph;
        this.scanner = scanner;
        this.emergencyManager = emergencyManager;
    }

    public void takeEmergencyInput() {

        System.out.print("How many emergencies? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            System.out.println("\nEnter details for Emergency " + (i + 1));

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
                System.out.println("Location not found. Skipping...");
                continue;
            }

            Emergency emergency =
                    new Emergency(id, type, severity, location);

            emergencyManager.addEmergency(emergency);

            System.out.println("Emergency registered successfully.");
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
}