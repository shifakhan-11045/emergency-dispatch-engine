package com.emergency.engine;

import java.util.Scanner;

public class ConsoleCityDataProvider implements CityDataProvider {

    @Override
    public CityGraph buildCity() {

        Scanner sc = new Scanner(System.in);
        CityGraph graph = new CityGraph();

        System.out.print("Enter number of locations: ");
        int locationsCount = sc.nextInt();
        sc.nextLine();

        Location[] locations = new Location[locationsCount];

        for (int i = 0; i < locationsCount; i++) {
            System.out.print("Enter location id: ");
            String id = sc.nextLine();

            System.out.print("Enter location name: ");
            String name = sc.nextLine();

            locations[i] = new Location(id, name);
        }

        System.out.print("Enter number of roads: ");
        int roadsCount = sc.nextInt();

        for (int i = 0; i < roadsCount; i++) {
            System.out.print("From location index: ");
            int from = sc.nextInt();

            System.out.print("To location index: ");
            int to = sc.nextInt();

            System.out.print("Distance: ");
            int distance = sc.nextInt();

            graph.addRoad(locations[from], locations[to], distance);
        }

        return graph;
    }
}
