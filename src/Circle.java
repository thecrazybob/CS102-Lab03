/**
 * Lab03 Instructions for Lab03 are in CS102_Lab03.pdf file located in the root
 * directory of Lab03 Revisions can be seen on the following GitHub URL:
 * https://github.com/thecrazybob/CS102-lab03 Style Guidelines:
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 *
 * @author Mohammed Sohail
 * @version 03/03/2021
 */

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
        return "[class " + getClass() + "]" + super.toString() + " and radius = " + this.radius;
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
