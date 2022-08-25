public class Circle {
    private double radius = 2.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double r = getRadius();
        //System.out.println(r);
        return (3.14 * r * r);
    }

}
