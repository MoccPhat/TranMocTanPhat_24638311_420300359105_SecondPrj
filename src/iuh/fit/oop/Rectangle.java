package iuh.fit.oop;

/**
 * Rectangle class.
 * Represents a rectangle with length and width.
 *
 * @author  Tran Moc Tan Phat
 * @version 1.0
 * @since   2025-08-24
 */
public class Rectangle {
    
    private double length;
    private double width;
    
    /**
     * Default constructor. Creates a rectangle with length = 0 and width = 0.
     */
    public Rectangle() {
        this(0.0, 0.0);
    }
    
    /**
     * Constructor with parameters.
     * @param length rectangle length
     * @param width  rectangle width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get rectangle length.
     * @return length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Set rectangle length.
     * @param length new length
     * @throws IllegalArgumentException if length &lt; 0
     */
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    /**
     * Get rectangle width.
     * @return width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Set rectangle width.
     * @param width new width
     * @throws IllegalArgumentException if width &lt; 0
     */
    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }
    
    /**
     * Calculate area of rectangle.
     * @return area
     */
    public double getArea() {
        return this.length * this.width;
    }
    
    /**
     * Calculate perimeter of rectangle.
     * @return perimeter
     */
    public double perimeter() {
        return (this.length + this.width) * 2;
    }
    
    /**
     * Return string representation of rectangle details.
     * @return string with rectangle information
     */
    @Override
    public String toString() {
         return "Rectangle {\n" +
                   "   length     = " + length + "\n" +
                   "   width      = " + width + "\n" +
                   "   getLength()= " + getLength() + "\n" +
                   "   getWidth() = " + getWidth() + "\n" +
                   "   getArea()  = " + getArea() + "\n" +
                   "   perimeter()= " + perimeter() + "\n" +
                   "}";
    }
}
