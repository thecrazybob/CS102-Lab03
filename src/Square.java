/**
 * Lab03 Instructions for Lab03 are in CS102_Lab03.pdf file located in the root
 * directory of Lab03 Revisions can be seen on the following GitHub URL:
 * https://github.com/thecrazybob/CS102-lab03 Style Guidelines:
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 *
 * @author Mohammed Sohail
 * @version 03/03/2021
 */

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
        return "[class " + getClass() + "]" + super.toString() + " and sideLength = " + sideLength;
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
