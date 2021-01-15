package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;
import ru.ssau.tk.alexanderkhkh.FirstRep.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {

    Location location = new Location();
    Location location2 = new Location();
    Location location3 = new Location();
    Location location4 = new Location();
    Location location5 = new Location();

    @Test
    public void testToString() {
        Settlement village = new Settlement();
        Settlement city = new Settlement();
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();
        Route route = new Route();
        village.setType(Location.SettlementType.VILLAGE);
        city.setType(Location.SettlementType.CITY);
        depot.setType(Location.WaypointType.DEPOT);
        warehouse.setType(Location.WaypointType.WAREHOUSE);
        village.setName("Miass");
        city.setName("Samara");
        depot.setName("depot");
        warehouse.setName("warehouse");
        village.setLatitude(104.3);
        city.setLatitude(64.9);
        depot.setLatitude(66.6);
        warehouse.setLatitude(56.6);
        village.setLongitude(44.4);
        city.setLongitude(40.8);
        depot.setLongitude(41.6);
        warehouse.setLongitude(42.2);
        route.addLocation(village);
        route.addLocation(city);
        route.addLocation(warehouse);
        route.addLocation(depot);
        assertEquals(route.toString(),
                "Settlement. Type: VILLAGE; name: Miass; latitude: 104.3; longitude: 44.4\n" +
                        "Settlement. Type: CITY; name: Samara; latitude: 64.9; longitude: 40.8\n" +
                        "Waypoint. Type: WAREHOUSE; name: warehouse; latitude: 56.6; longitude: 42.2\n" +
                        "Waypoint. Type: DEPOT; name: depot; latitude: 66.6; longitude: 41.6\n");
    }

    @Test
    public void testAddLocation() {

        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        assertEquals(route.getLocation(), Collections.EMPTY_LIST);

        route.addLocation(location);
        locations.add(location);
        assertEquals(route.getLocation(), locations);

        route.addLocation(location2);
        locations.add(location2);
        assertEquals(route.getLocation(), locations);

        route.addLocation(location3);
        locations.add(location3);
        assertEquals(route.getLocation(), locations);
    }

    @Test
    public void testAddIndexLocation() {

        List<Location> locations2 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location3);
        locations2.add(location3);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(1, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(2, location);
        locations2.add(location);
        assertEquals(route.getLocation(), locations2);
    }

    @Test
    public void testRemoveLocation() {

        List<Location> locations = new ArrayList<>();
        Route route = new Route();

        Location location = new Location();
        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();

        route.addLocation(location);
        route.addLocation(location1);
        route.addLocation(location2);
        route.addLocation(location3);

        locations.add(location);
        locations.add(location1);
        locations.add(location2);
        locations.add(location3);

        locations.remove(3);
        route.removeLocation(3);
        assertEquals(route.getLocation(), locations);

        locations.remove(2);
        route.removeLocation(2);
        assertEquals(route.getLocation(), locations);

        locations.remove(1);
        route.removeLocation(1);
        assertEquals(route.getLocation(), locations);
    }

    @Test
    public void testIterator() {
        Route route = new Route();
        int count = 0;

        route.addLocation(location);
        route.addLocation(location2);
        route.addLocation(location3);

        location.setId(0);
        location2.setId(1);
        location3.setId(2);

        for (Location locations : route) {
            assertEquals(locations.getId(), count++);
        }
        assertEquals(count, 3);

        assertEquals(route.getFirstLocation(), location);
        assertEquals(route.getLastLocation(), location3);
    }

    @Test
    public void testRemove() {
        List<Location> locations4 = new ArrayList<>();
        Route route1 = new Route();

        route1.addIndexLocation(0, location2);
        route1.addIndexLocation(1, location3);
        route1.addIndexLocation(2, location);

        locations4.add(location2);
        locations4.add(location);

        route1.remove(location3);
        assertEquals(route1.getLocation(), locations4);

        Route route2 = new Route();

        route2.addIndexLocation(0, location);
        route2.addIndexLocation(1, location2);
        route2.addIndexLocation(2, location3);
        route2.addIndexLocation(3, location4);
        route2.addIndexLocation(4, location5);

        location.setId(1);
        location2.setId(2);
        location3.setId(3);
        location4.setId(2);
        location5.setId(2);

        location2.setName("One");
        location4.setName("Two");
        location5.setName("One");

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3, location4, location5)));

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3, location4)));

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3)));

        route2.remove(location2);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location, location3)));
    }

    @Test
    public void testEquals() {
        Route route = new Route();
        Route equalRoute = new Route();
        Route notEqualRoute = new Route();
        Person person = new Person();
        Location city1 = new Settlement();
        Location city2 = new Settlement();

        Location newVillage1 = new Settlement();
        Location depot1 = new Waypoint();
        Location warehouse = new Waypoint();
        Location depot2 = new Waypoint();
        city1.setId(1);
        city2.setId(2);
        newVillage1.setId(1);
        depot1.setId(3);
        warehouse.setId(4);
        depot2.setId(1);

        route.addLocation(city1);
        route.addLocation(city2);
        route.addLocation(depot1);
        route.addLocation(warehouse);

        equalRoute.addLocation(newVillage1);
        equalRoute.addLocation(city2);
        equalRoute.addLocation(depot1);
        equalRoute.addLocation(warehouse);

        notEqualRoute.addLocation(city1);
        notEqualRoute.addLocation(city1);
        notEqualRoute.addLocation(depot1);
        notEqualRoute.addLocation(warehouse);

        assertTrue(route.equals(equalRoute));
        assertFalse(route.equals(notEqualRoute));
        assertFalse(route.equals(person));

        equalRoute.remove(warehouse);
        assertFalse(route.equals(equalRoute));

        equalRoute.addLocation(warehouse);
        equalRoute.removeLocation(0);
        equalRoute.addLocation(depot2);
        assertFalse(route.equals(equalRoute));
    }

    @Test
    public void testLength() {
        Route route = new Route();
        Location village = new Settlement();
        Location city = new Settlement();
        Location depot = new Waypoint();
        Location warehouse = new Waypoint();
        village.setLatitude(60.);
        city.setLatitude(70.);
        depot.setLatitude(75.);
        warehouse.setLatitude(50.);
        village.setLongitude(66.);
        city.setLongitude(44.);
        depot.setLongitude(55.);
        warehouse.setLongitude(77.);
        route.addLocation(city);
        route.addLocation(village);
        route.addLocation(depot);
        route.addLocation(warehouse);
        assertEquals(route.length(), 76., 0.1);
        route.addLocation(city);
        route.removeLocation(2);
        assertEquals(route.length(), 77.6, 0.1);
    }
}