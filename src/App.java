public class App {

    public static void main(String[] args) {

        CityDataProvider provider =
                new ConsoleCityDataProvider();
                // or new SampleCityDataProvider();

        CityGraph graph = provider.buildCity();
        graph.printGraph();

        System.out.println("City loaded successfully");
    }
}
