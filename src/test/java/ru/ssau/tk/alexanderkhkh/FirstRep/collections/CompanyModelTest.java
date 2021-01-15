package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

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

    private void fillModels() {
        village1.setName("village1");
        village1.setType(Location.SettlementType.VILLAGE);
        village2.setName("village2");
        village2.setType(Location.SettlementType.VILLAGE);
        city1.setName("city1");
        city1.setType(Location.SettlementType.CITY);
        city2.setName("city2");
        city2.setType(Location.SettlementType.CITY);
        village1Warehouse.setName("village1.Warehouse");
        village1Warehouse.setType(Location.WaypointType.WAREHOUSE);
        village2Waypoint.setName("village2.Waypoint");
        village2Waypoint.setType(Location.WaypointType.EMPTY);
        city1Depot.setName("city1.Depot");
        city1Depot.setType(Location.WaypointType.DEPOT);
        city2Warehouse.setName("city2.Warehouse");
        city2Warehouse.setType(Location.WaypointType.WAREHOUSE);
        loneDepot.setName("lone Depot");
        loneDepot.setType(Location.WaypointType.DEPOT);

        companyModel1.addSettlement("village1", 20.36, 45.12, Location.SettlementType.VILLAGE, 1200);
        companyModel1.addSettlement("village2", 20.45, 45.81, Location.SettlementType.VILLAGE, 540);
        companyModel1.addSettlement("city1", 20.47, 46.01, Location.SettlementType.CITY, 1250000);
        companyModel1.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY, 384000);
        companyModel1.addWaypoint("village1.Warehouse", 20.36, 45.12, Location.WaypointType.WAREHOUSE, village1);
        companyModel1.addWaypoint("village2.Waypoint", 20.36, 45.12, Location.WaypointType.EMPTY, village2);
        companyModel1.addWaypoint("city1.Depot", 20.47, 46.01, Location.WaypointType.DEPOT, city1);
        companyModel1.addWaypoint("lone Depot", 20.54, 45.85, Location.WaypointType.DEPOT, null);
        companyModel1.addWaypoint("city2.Warehouse", 21.87, 45.84, Location.WaypointType.WAREHOUSE, city2);
        companyModel1.addDriver("Alexander", Person.Gender.Male, new Date(121, Calendar.APRIL, 21));
        companyModel1.addDriver("Paul", Person.Gender.Male, new Date(127, Calendar.DECEMBER, 5));
        companyModel1.addDriver("Dasha", Person.Gender.Female, new Date(135, Calendar.AUGUST, 16));
        companyModel1.addDriver("Misha", Person.Gender.Male, new Date(140, Calendar.JANUARY, 2));
        companyModel1.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village2Waypoint, village1Warehouse, city2Warehouse, loneDepot)));
        companyModel1.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, city2, city2Warehouse, loneDepot)));
        companyModel1.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village2, village2Waypoint, village1Warehouse, city1, city1Depot)));

        companyModel2.addSettlement("village1", 20.36, 45.12, Location.SettlementType.VILLAGE, 1200);
        companyModel2.addSettlement("village2", 20.45, 45.81, Location.SettlementType.VILLAGE, 540);
        companyModel2.addSettlement("city1", 20.47, 46.01, Location.SettlementType.CITY, 1250000);
        companyModel2.addSettlement("city2", 21.87, 45.84, Location.SettlementType.CITY, 384000);
        companyModel2.addWaypoint("city1.Depot", 20.47, 46.01, Location.WaypointType.DEPOT, city1);
        companyModel2.addWaypoint("lone Depot", 20.54, 45.85, Location.WaypointType.DEPOT, null);
        companyModel2.addDriver("Alexander", Person.Gender.Male, new Date(121, Calendar.APRIL, 21));
        companyModel2.addDriver("Paul", Person.Gender.Female, new Date(127, Calendar.DECEMBER, 5));
        companyModel2.addDriver("Dasha", Person.Gender.Female, new Date(135, Calendar.AUGUST, 16));
        companyModel2.addDriver("Misha", Person.Gender.Male, new Date(140, Calendar.JANUARY, 2));
        companyModel2.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village1, village2, city2, loneDepot)));
        companyModel2.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1, city2, city1, city1Depot)));
    }

    @Test
    public void testGetAllLocations() {
        fillModels();
        Collection<Location> locationsOne = companyModel1.getAllLocations();
        Collection<Location> locationsTwo = companyModel2.getAllLocations();
        for (Location location : locationsOne) {
            System.out.println(location.toString());
        }
        System.out.println("\n------------------\n");
        for (Location location : locationsTwo) {
            System.out.println(location.toString());
        }
    }

    @Test
    public void testGetAllRoutes() {
        fillModels();
        Collection<Route> routesOne = companyModel1.getAllRoutes();
        Collection<Route> routesTwo = companyModel2.getAllRoutes();
        for (Route route : routesOne) {
            System.out.println(route.toString());
        }
        System.out.println("------------------\n");
        for (Route route : routesTwo) {
            System.out.println(route.toString());
        }
    }

    @Test
    public void testGetAllDrivers() {
        fillModels();
        Collection<Driver> drivers = companyModel1.getAllDrivers();
        for (Driver driver : drivers) {
            System.out.println(driver.toString());
        }
    }
}