public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(5.0);

        String circleDetails = circle.getRadius() + " " + circle.getArea();
        System.out.println(circleDetails);

        String circleDetails2 = circle2.getRadius() + " " + circle2.getArea();
        System.out.println(circleDetails2);
    }
}
