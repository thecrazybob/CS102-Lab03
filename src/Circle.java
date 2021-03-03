public class Circle extends Shape2D {

    // properties
    public double radius;

    // constructor
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // program code

    // methods

    /**
     * Returns the area of the circle
     * 
     * @return double
     */
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    };

    /**
     * @return double
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    };

    /**
     * Returns the string representation of the circle
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "[class Circle]" + super.toString() + " and radius = " + this.radius;
    }

    /**
     * Returns if the input object equals the current object
     * 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {

        return (super.equals(o) && ((Circle) o).radius == radius);

    };

}
