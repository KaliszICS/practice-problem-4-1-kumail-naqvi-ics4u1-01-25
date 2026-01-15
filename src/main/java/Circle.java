/**
 * Represents a circle with a radius.
 * Provides methods to compute area and circumference.
 * @author Kumail
 * @version 1.0
 */
public class Circle {
    private double radius;
    private static final double PI = 3.14;
    /**
     * Constructs a Circle with the given radius.
     *
     * @param radius the radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Computes the area of the circle.
     *
     * @return area
     */
    public double area() {
        return PI * radius * radius;
    }
    /**
     * Computes the circumference of the circle.
     *
     * @return circumference
     */
    public double circumference() {
        return 2 * PI * radius;
    }
}