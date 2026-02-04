import com.emergency.engine.CityBuilder;
import com.emergency.engine.CityGraph;

public class App {

    public static void main(String[] args) {

        CityBuilder cityBuilder = new CityBuilder();
        CityGraph graph = cityBuilder.buildCity();

        graph.printGraph();

        System.out.println("City loaded dynamically");
    }
}
