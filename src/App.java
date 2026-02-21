import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Build city
        ConsoleCityDataProvider cityProvider =
                new ConsoleCityDataProvider(sc);

        CityGraph cityGraph = cityProvider.buildCity();

        System.out.println("\nCity Graph:");
        cityGraph.printGraph();

        // 2️⃣ Emergency system
        EmergencyManager emergencyManager = new EmergencyManager();

        ConsoleInputHandler emergencyHandler =
                new ConsoleInputHandler(cityGraph, sc, emergencyManager);

        // 🔥 Ask how many emergencies
        System.out.print("\nHow many emergencies to register? ");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.println("\nEnter details for Emergency " + i);
            emergencyHandler.takeEmergencyInput();
        }

        // 🚑 Dispatch all
        emergencyManager.dispatchAllEmergencies();
    }
}