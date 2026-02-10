import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // 1️⃣ Build city
        Scanner sc = new Scanner(System.in);

        ConsoleCityDataProvider cityProvider =
                new ConsoleCityDataProvider(sc);

        CityGraph cityGraph = cityProvider.buildCity();

        System.out.println("\nCity Graph:");
        cityGraph.printGraph();

        // 2️⃣ Now handle emergencies
        ConsoleInputHandler emergencyHandler =
                new ConsoleInputHandler(cityGraph, sc);

        emergencyHandler.takeEmergencyInput();
    }
}
