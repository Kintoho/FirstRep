package ru.ssau.tk.alexanderkhkh.FirstRep;

public class NamedPoint extends Point {
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

}
