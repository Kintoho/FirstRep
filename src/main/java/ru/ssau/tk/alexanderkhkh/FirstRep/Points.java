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

    public static Point enlarge(Point point, double a){
        return  new Point(point.getX()*a, point.getY()*a, point.getZ()*a);
    }

    public static double length(Point point){
        return point.length();
    }

    public static Point opposite(Point point){
        return new Point(0 - point.getX(), 0 - point.getY(), 0 - point.getZ());
    }

    public static Point inverse(Point point){
        return new Point(1/ point.getX(), 1/ point.getY(), 1/ point.getZ());
    }

    public static double scalarProduct(Point point1, Point point2){
        return point1.getX()*point2.getX() + point1.getY()*point2.getY() + point1.getZ()* point2.getZ();
    }

    public static Point vectorProduct(Point point1, Point point2){
        return new Point(point1.getY()*point2.getZ() - point1.getZ()*point2.getY(), point1.getZ()*point2.getX() - point1.getX()*point2.getZ(),
                point1.getX()*point2.getY() - point1.getY()*point2.getX());
    }


    public static void main(String[] args) {
        System.out.println();
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        Point point3 = sum(point1, point2);
        System.out.println(point3.getX());
        System.out.println(length(point1));
    }
}
