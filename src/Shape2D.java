/**
 * Lab03 Instructions for Lab03 are in CS102_Lab03.pdf file located in the root
 * directory of Lab03 Revisions can be seen on the following GitHub URL:
 * https://github.com/thecrazybob/CS102-lab03 Style Guidelines:
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 *
 * @author Mohammed Sohail
 * @version 03/03/2021
 */

public abstract class Shape2D {

    // properties
    public int x;
    public int y;

    // constructor
    public Shape2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // program code

    // methods

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public double calculateDistance(Object anyShape) {

        if (!(anyShape instanceof Shape2D)) {
            return -1;
        }

        double diffInX = this.x - ((Shape2D) anyShape).x;
        double diffInY = this.y - ((Shape2D) anyShape).y;

        double distance = Math.sqrt((diffInX * diffInX) + (diffInY * diffInY));

        return distance;
    }

    @Override
    public String toString() {

        return "[" + this.getClass() + "]" + "x = " + this.x + "," + " y = " + this.y;

    }

    public boolean equals(Object o) {

        return (this.x == ((Shape2D) o).x && y == ((Shape2D) o).y);

    }
}
