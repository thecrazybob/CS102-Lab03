public class Rectangle extends Shape2D {

    // properties
    public int height;
    public int width;

    // constructor
    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    // program code

    // methods

    /**
     * Returns the area by multiplying width by height
     * 
     * @return double
     */
    public double calculateArea() {
        return width * height;
    };

    /**
     * Returns the perimeter of the rectangle
     * 
     * @return double
     */
    public double calculatePerimeter() {

        return 2 * (width + height);
    };

    /**
     * Returns the string representation of the rectangle
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "[class Rectangle]" + super.toString() + ", height = " + height + " and width = " + width;
    }

    /**
     * Returns if the input object equals the current object
     * 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {

        return (super.equals(o) && ((Rectangle) o).height == height && ((Rectangle) o).width == width);

    };
}
