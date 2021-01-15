package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;
import static org.testng.Assert.*;
import java.util.*;


public class CompanyModelTest {

    CompanyModel companyModel1 = new CompanyModel();
    CompanyModel companyModel2 = new CompanyModel();
    Settlement village1 = new Settlement();
    Settlement village2 = new Settlement();
    Settlement city1 = new Settlement();
    Settlement city2 = new Settlement();
    Waypoint village1Warehouse = new Waypoint();
    Waypoint village2Waypoint = new Waypoint();
    Waypoint city1Depot = new Waypoint();
    Waypoint city2Warehouse = new Waypoint();
    Waypoint loneDepot = new Waypoint();
    Driver Alexander = new Driver();
    Driver Paul = new Driver();
    Driver Alina = new Driver();
    Driver Stepan = new Driver();
    Route route1 = new Route();
    Route route2 = new Route();
    Route route3 = new Route();
    Route route4 = new Route();

    private void fillModels() {
        village1 = companyModel1.addSettlement("village1", 20.36, 45.12, Location.SettlementType.VILLAGE, 1200);
        village2 = companyModel1.addSettlement("village2", 20.45, 48.81, Location.SettlementType.VILLAGE, 540);
        city1 = companyModel1.addSettlement("city1", 20.47, 46.01, Location.SettlementType.CITY, 1250000);
        city2 = companyModel1.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY, 384000);
        village1Warehouse = companyModel1.addWaypoint("village1.Warehouse", 20.36, 45.12, Location.WaypointType.WAREHOUSE, village1);
        village2Waypoint = companyModel1.addWaypoint("village2.Waypoint", 20.36, 45.12, Location.WaypointType.EMPTY, village2);
        city1Depot = companyModel1.addWaypoint("city1.Depot", 20.47, 46.01, Location.WaypointType.DEPOT, city1);
        loneDepot = companyModel1.addWaypoint("lone Depot", 20.54, 45.85, Location.WaypointType.DEPOT, null);
        city2Warehouse = companyModel1.addWaypoint("city2.Warehouse", 21.87, 45.84, Location.WaypointType.WAREHOUSE, city2);

        companyModel1.addSettlement("village1", 20.36, 45.12, Location.SettlementType.VILLAGE, 1200);
        companyModel1.addSettlement("village2", 20.45, 45.81, Location.SettlementType.VILLAGE, 540);
        companyModel1.addSettlement("city1", 20.47, 46.01, Location.SettlementType.CITY, 1250000);
        companyModel1.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY, 384000);
        companyModel1.addWaypoint("village1.Warehouse", 20.36, 45.12, Location.WaypointType.WAREHOUSE, village1);
        companyModel1.addWaypoint("village2.Waypoint", 20.36, 45.12, Location.WaypointType.EMPTY, village2);
        companyModel1.addWaypoint("city1.Depot", 20.47, 46.01, Location.WaypointType.DEPOT, city1);
        companyModel1.addWaypoint("lone Depot", 20.54, 45.85, Location.WaypointType.DEPOT, null);
        companyModel1.addWaypoint("city2.Warehouse", 21.87, 45.84, Location.WaypointType.WAREHOUSE, city2);
        Alexander = companyModel1.addDriver("Alexander", Person.Gender.Male, new Date(101, Calendar.JUNE, 21));
        Paul = companyModel1.addDriver("Paul", Person.Gender.Male, new Date(100, Calendar.DECEMBER, 5));
        route1 = companyModel1.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village2Waypoint, village1Warehouse, city2Warehouse, loneDepot)));
        route2 = companyModel1.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, city2, city2Warehouse, loneDepot)));
        companyModel1.assignRoute(Alexander, route1);
        companyModel1.assignRoute(Paul, route2);


        companyModel2.addSettlement("village1", 20.36, 45.12, Location.SettlementType.VILLAGE, 1200);
        companyModel2.addSettlement("village2", 20.45, 48.81, Location.SettlementType.VILLAGE, 540);
        companyModel2.addSettlement("city1", 20.47, 46.01, Location.SettlementType.CITY, 1250000);
        companyModel2.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY, 384000);
        companyModel2.addWaypoint("city1.Depot", 20.47, 46.01, Location.WaypointType.DEPOT, city1);
        companyModel2.addWaypoint("lone Depot", 20.54, 45.85, Location.WaypointType.DEPOT, null);
        Alina = companyModel2.addDriver("Alina", Person.Gender.Female, new Date(95, Calendar.NOVEMBER, 10));
        Stepan = companyModel2.addDriver("Stepan", Person.Gender.Male, new Date(99, Calendar.SEPTEMBER, 28));
        route3 = companyModel2.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village1, village2, city2, loneDepot)));
        route4 = companyModel2.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1, city2, city1, city1Depot)));
        companyModel2.assignRoute(Alina, route3);
        companyModel2.assignRoute(Stepan, route4);
    }

    @Test
    public void testGetAllLocations() {
        int i = 1;
        fillModels();
        Collection<Location> locations1 = companyModel1.getAllLocations();
        Collection<Location> locations2 = companyModel2.getAllLocations();
        for (Location location : locations1) {
            if (i == 1) {
                assertEquals(location.toString(), village1.toString());
            }
            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }
            if (i == 3) {
                assertEquals(location.toString(), city1.toString());
            }
            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }
            if (i == 5) {
                assertEquals(location.toString(), village1Warehouse.toString());
            }
            if (i == 6) {
                assertEquals(location.toString(), village2Waypoint.toString());
            }
            if (i == 7) {
                assertEquals(location.toString(), city1Depot.toString());
            }
            if (i == 8) {
                assertEquals(location.toString(), loneDepot.toString());
            }
            if (i == 9) {
                assertEquals(location.toString(), city2Warehouse.toString());
            }
            i++;
        }

        i = 1;
        for (Location location : locations2) {
            if (i == 1) {
                assertEquals(location.toString(), village1.toString());
            }
            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }
            if (i == 3) {
                assertEquals(location.toString(), city1.toString());
            }
            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }
            if (i == 5) {
                assertEquals(location.toString(), city1Depot.toString());
            }
            if (i == 6) {
                assertEquals(location.toString(), loneDepot.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllRoutes() {
        fillModels();
        Collection<Route> routesOne = companyModel1.getAllRoutes();
        Collection<Route> routesTwo = companyModel2.getAllRoutes();
        int i = 1;
        for (Route route : routesOne) {
            if (i == 1){
                assertEquals(route.toString(), route1.toString());
            }
            if (i == 2){
                assertEquals(route.toString(), route2.toString());
            }
            i++;
        }
        i = 1;
        for (Route route : routesTwo) {
            if (i == 3){
                assertEquals(route.toString(), route3.toString());
            }
            if (i == 4){
                assertEquals(route.toString(), route4.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllDrivers() {
        Collection<Driver> driversOne = companyModel1.getAllDrivers();
        Collection<Driver> driversTwo = companyModel2.getAllDrivers();
        int i = 1;
        for (Driver driver : driversOne) {
            if (i == 1) {
                assertEquals(driver.toString(), Alexander.toString());
            }
            if (i == 2) {
                assertEquals(driver.toString(), Paul.toString());
            }
            i++;
        }
        i = 1;
        for (Driver driver : driversTwo) {
            if (i == 3) {
                assertEquals(driver.toString(), Alina.toString());
            }
            if (i == 4) {
                assertEquals(driver.toString(), Stepan.toString());
            }
            i++;
        }
    }

    @Test
    public void testAssignRoute() {
        fillModels();
        Map<Driver, Route> mapOne = companyModel1.getDriverRouteMap();
        Map<Driver, Route> mapTwo = companyModel2.getDriverRouteMap();
        assertEquals(mapOne.size(), 2);
        assertEquals(mapTwo.size(), 2);
        assertEquals(mapOne.get(Alexander), route1);
        assertEquals(mapOne.get(Paul), route2);
        assertEquals(mapTwo.get(Alina), route3);
        assertEquals(mapTwo.get(Stepan), route4);
    }

    @Test
    public void testRouteComparator() {
        fillModels();
        List<Route> routes = new ArrayList<>(Arrays.asList(route1, route2, route3, route4));
        Collections.sort(routes);
        assertEquals(routes, new ArrayList<>(Arrays.asList(route2, route4, route1, route3)));
    }
}