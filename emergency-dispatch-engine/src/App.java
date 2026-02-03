import com.emergency.engine.*;
public class App {
    public static void main(String[] args) throws Exception {
    
    CityGraph graph = new CityGraph();

    Location a = new Location("A", "Hospital");
    Location b = new Location("B", "Market");
    Location c = new Location("C", "Highway");

    graph.addRoad(a, b, 5);
    graph.addRoad(b, c, 7);
    graph.addRoad(a, c, 12);

    graph.printGraph();
   System.out.println("Graph created successfully");

    }
}
