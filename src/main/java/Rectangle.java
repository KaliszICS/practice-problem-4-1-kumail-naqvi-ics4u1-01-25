/**
 * Represents a rectangle with a length and width.
 * Provides methods to compute area and perimeter.
 * @author Kumail
 * @version 1.0
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructs a Rectangle with the given length and width.
     *
     * @param length the rectangle length
     * @param width  the rectangle width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** 
     * @return the length 
    */
    public double getLength() {
        return length;
    }
    /** 
     * @return the width 
    */
    public double getWidth() {
        return width;
    }
    /**
     * Computes the area of the rectangle.
     * If either dimension is non-positive, returns 0.
     *
     * @return area
     */
    public double area() {
        if (length <= 0 || width <= 0) return 0.0;
        return length * width;
    }
    /**
     * Computes the perimeter of the rectangle.
     * If either dimension is non-positive, returns 0.
     *
     * @return perimeter
     */
    public double perimeter() {
        if (length <= 0 || width <= 0) return 0.0;
        return 2 * (length + width);
    }
}