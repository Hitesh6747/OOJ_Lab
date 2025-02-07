interface Polygon {
    default double getPerimeter(){
        return 0;
    }
    double getArea();
}
class Circless implements Polygon {
    double radius;
    Circless(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
class Square implements Polygon {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }
}
public class Shapess{
    public static void main(String[] args){
        Circless c1 = new Circless(10);
        double carea=c1.getArea();
        double cperimeter=c1.getPerimeter();
        Square s1 = new Square(10);
        double sarea=s1.getArea();
        double sperimeter=s1.getPerimeter();
        System.out.println("Area of Circle:"+carea);
        System.out.println("Perimeter of Circle:"+cperimeter);
        System.out.println("Area of Sqaure:"+sarea);
        System.out.println("Perimeter of Square:"+sperimeter);
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
    }
}
