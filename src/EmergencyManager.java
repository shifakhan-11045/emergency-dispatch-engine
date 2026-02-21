import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class EmergencyManager {

    private final PriorityQueue<Emergency> emergencyQueue =
            new PriorityQueue<>(new EmergencyPriorityComparator());

    private final List<Ambulance> ambulances = new ArrayList<>();

    public EmergencyManager() {
        // Create some ambulances manually
        ambulances.add(new Ambulance("AMB-1", new Location("H", "Hospital")));
        ambulances.add(new Ambulance("AMB-2", new Location("M", "Market")));
    }

    public void addEmergency(Emergency emergency) {
        emergencyQueue.add(emergency);
    }

    public void dispatchAllEmergencies() {

        if (emergencyQueue.isEmpty()) {
            System.out.println("No emergencies to dispatch.");
            return;
        }

        System.out.println("\nDispatching Emergencies (by priority):");

        while (!emergencyQueue.isEmpty()) {

            Emergency emergency = emergencyQueue.poll();

            Ambulance ambulance = getAvailableAmbulance();

            if (ambulance == null) {
                System.out.println("No ambulance available for: " + emergency);
                continue;
            }

            ambulance.assignEmergency(emergency.getLocation());

            System.out.println("Dispatching " + ambulance.getId() +
                    " to handle -> " + emergency);

            ambulance.completeEmergency(); // make available again
        }
    }

    private Ambulance getAvailableAmbulance() {
        for (Ambulance ambulance : ambulances) {
            if (ambulance.isAvailable()) {
                return ambulance;
            }
        }
        return null;
    }
}