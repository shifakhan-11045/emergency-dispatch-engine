package com.emergency.engine;

public class CityBuilder {

    public CityGraph buildCity() {

        CityGraph graph = new CityGraph();

        Location hospital = new Location("A", "Hospital");
        Location market = new Location("B", "Market");
        Location highway = new Location("C", "Highway");

        graph.addRoad(hospital, market, 5);
        graph.addRoad(market, highway, 7);
        graph.addRoad(hospital, highway, 12);

        return graph;
    }
}
