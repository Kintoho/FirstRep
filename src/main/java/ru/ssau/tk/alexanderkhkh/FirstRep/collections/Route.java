package ru.ssau.tk.alexanderkhkh.FirstRep.collections;

import java.util.ArrayList;

public class Route {
    private ArrayList<Location> locations = new ArrayList<>();

    public ArrayList<Location> getLocation() {
        return locations;
    }

    public void addLocation(Location location){
        this.locations.add(location);
    }

    public void addIndexLocation(int index,Location location){
        this.locations.add(index,location);
    }

    public void deleteLocation(int index){
        this.locations.remove(index);
    }
}
