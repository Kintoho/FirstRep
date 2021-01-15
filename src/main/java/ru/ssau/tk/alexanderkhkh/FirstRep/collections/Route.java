package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Route implements Iterable<Location> {
    private List<Location> locations = new ArrayList<>();

    public List<Location> getLocation() {
        return locations;
    }

    public void addLocation(Location location){
        this.locations.add(location);
    }

    public void addIndexLocation(int index,Location location){
        this.locations.add(index,location);
    }

    public void removeLocation(int index){
        this.locations.remove(index);
    }

    public Location getFirstLocation(){
        return locations.get(0);
    }

    public Location getLastLocation(){
        return locations.get(locations.size()-1);
    }

    public void remove(Location location){
        int count = 0;

        for (Location currentLocation : this.locations) {
            if (currentLocation.equals(location)) {
                removeLocation(count);
                return;
            }
            count++;
        }
    }

    @Override
    public Iterator<Location> iterator() {
        return locations.iterator();
    }
}
