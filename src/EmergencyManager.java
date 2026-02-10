import java.util.PriorityQueue;

public class EmergencyManager {

    private final PriorityQueue<Emergency> emergencyQueue =
            new PriorityQueue<>(new EmergencyPriorityComparator());

    public void registerEmergency(Emergency emergency) {
        emergencyQueue.offer(emergency);
        System.out.println("Emergency registered successfully");
    }

    public void dispatchEmergency() {
        if (emergencyQueue.isEmpty()) {
            System.out.println("No emergencies to dispatch");
            return;
        }

        Emergency e = emergencyQueue.poll();
        System.out.println("Dispatching Emergency:");
        System.out.println(e);
    }
}
