package ru.ssau.tk.alexanderkhkh.FirstRep;
import java.lang.Math;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return "[" + x + ", " + y + ", " + z + ']';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length(){
        return Math.sqrt(getX()*getX() + getY()*getY() + getZ()*getZ());
    }
}
