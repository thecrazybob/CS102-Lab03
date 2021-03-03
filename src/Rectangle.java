/**
 * Lab03 Instructions for Lab03 are in CS102_Lab03.pdf file located in the root
 * directory of Lab03 Revisions can be seen on the following GitHub URL:
 * https://github.com/thecrazybob/CS102-lab03 Style Guidelines:
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 *
 * @author Mohammed Sohail
 * @version 03/03/2021
 */

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
        return "[class " + getClass() + "]" + super.toString() + ", height = " + height + " and width = " + width;
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
