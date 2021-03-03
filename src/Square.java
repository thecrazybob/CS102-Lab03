public class Square extends Shape2D {

    // properties
    public int sideLength;

    // constructor
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    // program code

    // methods

    /**
     * Returns the area of the square
     * 
     * @return double
     */
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    };

    /**
     * Returns the perimeter of the square
     * 
     * @return double
     */
    public double calculatePerimeter() {
        return 4 * sideLength;
    };

    /**
     * Returns the string representation of the square
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "[class Square]" + super.toString() + " and sideLength = " + sideLength;
    }

    /**
     * Returns if the input object equals the current object
     * 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {

        return (super.equals(o) && ((Square) o).sideLength == sideLength);

    };

}
