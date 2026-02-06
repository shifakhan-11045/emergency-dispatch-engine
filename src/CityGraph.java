import java.util.*;


public class CityGraph {

    // Adjacency list
    private final Map<Location, List<Road>> adjacencyList = new HashMap<>();

    // Add a location (node)
    public void addLocation(Location location) {
        adjacencyList.putIfAbsent(location, new ArrayList<>());
    }

    // Add a road (edge)
    public void addRoad(Location from, Location to, int distance) {
        adjacencyList.putIfAbsent(from, new ArrayList<>());
        adjacencyList.putIfAbsent(to, new ArrayList<>());

        adjacencyList.get(from).add(new Road(from, to, distance));
        adjacencyList.get(to).add(new Road(to, from, distance)); // bidirectional
    }

    // Get neighbors
    public List<Road> getNeighbors(Location location) {
        return adjacencyList.getOrDefault(location, Collections.emptyList());
    }

    // For debugging
    public void printGraph() {
        for (Location loc : adjacencyList.keySet()) {
            System.out.print(loc.getName() + " -> ");
            for (Road road : adjacencyList.get(loc)) {
                System.out.print(road.getTo().getName() + "(" + road.getDistance() + ") ");
            }
            System.out.println();
        }
    }

    public Map<Location, List<Road>> getAdjacencyList() {
        return adjacencyList;
    }
}
