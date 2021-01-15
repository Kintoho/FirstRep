package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {

    Location location = new Location();
    Location location2 = new Location();
    Location location3 = new Location();

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
}