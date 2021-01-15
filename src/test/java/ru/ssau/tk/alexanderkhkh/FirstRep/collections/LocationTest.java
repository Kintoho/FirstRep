package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocationTest {

    @Test
    public void testTestEquals() {
        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        location1.setId(1);
        location2.setId(2);
        location3.setId(1);
        assertTrue(location1.equals(location3));
        assertFalse(location2.equals(location1));
        location3 = location1;
        assertTrue(location1.equals(location3));

    }

    @Test
    public void testToString() {
        Settlement villageOne = new Settlement();
        Settlement city = new Settlement();
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();

        villageOne.setType(Location.SettlementType.VILLAGE);
        city.setType(Location.SettlementType.CITY);
        depot.setType(Location.WaypointType.DEPOT);
        warehouse.setType(Location.WaypointType.WAREHOUSE);
        villageOne.setName("Miass");
        city.setName("Samara");
        depot.setName("depot");
        warehouse.setName("warehouse");
        villageOne.setLatitude(104.3);
        city.setLatitude(64.9);
        depot.setLatitude(66.6);
        warehouse.setLatitude(56.6);
        villageOne.setLongitude(44.4);
        city.setLongitude(40.8);
        depot.setLongitude(41.6);
        warehouse.setLongitude(42.2);
        assertEquals(villageOne.toString(), "Settlement. Type: VILLAGE; name: Miass; latitude: 104.3; longitude: 44.4");
        assertEquals(city.toString(), "Settlement. Type: CITY; name: Samara; latitude: 64.9; longitude: 40.8");
        assertEquals(depot.toString(), "Waypoint. Type: DEPOT; name: depot; latitude: 66.6; longitude: 41.6");
        assertEquals(warehouse.toString(), "Waypoint. Type: WAREHOUSE; name: warehouse; latitude: 56.6; longitude: 42.2");
    }
}