package com.emergency.engine;

public class SampleCityDataProvider implements CityDataProvider {

    @Override
    public CityGraph buildCity() {

        CityGraph graph = new CityGraph();

        Location a = new Location("A", "Hospital");
        Location b = new Location("B", "Market");
        Location c = new Location("C", "Highway");

        graph.addRoad(a, b, 5);
        graph.addRoad(b, c, 7);
        graph.addRoad(a, c, 12);

        return graph;
    }
}
