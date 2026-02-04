import com.emergency.engine.CityDataProvider;
import com.emergency.engine.CityGraph;
import com.emergency.engine.ConsoleCityDataProvider;

public class App {

    public static void main(String[] args) {

        CityDataProvider provider = new ConsoleCityDataProvider();
                // or new SampleCityDataProvider();

        CityGraph graph = provider.buildCity();
        graph.printGraph();

        System.out.println("City loaded successfully");
    }
}
