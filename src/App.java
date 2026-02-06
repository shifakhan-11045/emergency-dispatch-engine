public class App {

    public static void main(String[] args) {

        // 1️⃣ Build city
        ConsoleCityDataProvider cityProvider =
                new ConsoleCityDataProvider();

        CityGraph cityGraph = cityProvider.buildCity();

        System.out.println("\nCity Graph:");
        cityGraph.printGraph();

        // 2️⃣ Now handle emergencies
        ConsoleInputHandler emergencyHandler =
                new ConsoleInputHandler(cityGraph);

        emergencyHandler.takeEmergencyInput();
    }
}
