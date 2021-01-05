package ru.ssau.tk.alexanderkhkh.FirstRep;

public class Points{
    private Points() {
    }

    public static Point sum(Point point1 , Point point2){
        return new Point(point1.getX()+point2.getX(),point1.getY()+point2.getY(), point1.getZ()+point2.getZ());
    }

    public static Point substract(Point point1 , Point point2){
        return new Point(point1.getX()-point2.getX(),point1.getY()-point2.getY(), point1.getZ()-point2.getZ());
    }

    public static Point multiply(Point point1 , Point point2){
        return new Point(point1.getX()*point2.getX(),point1.getY()*point2.getY(), point1.getZ()*point2.getZ());
    }

    public static Point divide(Point point1 , Point point2){
        return new Point(point1.getX()/point2.getX(),point1.getY()/point2.getY(), point1.getZ()/point2.getZ());
    }

    public static void main(String[] args) {
        System.out.println();
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        Point point3 = sum(point1, point2);
        System.out.println(point3.getX());
    }
}
