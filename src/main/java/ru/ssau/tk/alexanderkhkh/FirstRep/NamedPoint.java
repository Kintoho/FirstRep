package ru.ssau.tk.alexanderkhkh.FirstRep;

import ru.ssau.tk.alexanderkhkh.FirstRep.generator.Resettable;

public class NamedPoint extends Point implements Resettable {
    public  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamedPoint(){
        this(0,0,0, "Origin");

    }
    public NamedPoint(double x, double y, double z){
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name){
        super(x, y, z);
        this.name = name;
    }

    @Override
    public void reset(){
        setName("Absent");
    }
}
