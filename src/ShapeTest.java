/**
 * Lab03 Instructions for Lab03 are in CS102_Lab03.pdf file located in the root
 * directory of Lab03 Revisions can be seen on the following GitHub URL:
 * https://github.com/thecrazybob/CS102-lab03 Style Guidelines:
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 *
 * @author Mohammed Sohail
 * @version 03/03/2021
 */

public class ShapeTest {

    /**
     * Returns the largest area from the input shapes arraylist
     * 
     * @param shapes
     * @return Shape2D
     */
    public static Shape2D findLargestArea(Shape2D[] shapes) {

        // variables that store value and index of largest value
        double largestAreaValue = 0;
        int largestAreaIndex = 0;

        // loop through values
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].calculateArea() > largestAreaValue) {
                largestAreaValue = shapes[i].calculateArea();
                largestAreaIndex = i;
            }
        }

        return shapes[largestAreaIndex];

    }

    /**
     * Returns the longest perimeter from the input shapes arraylist
     * 
     * @param shapes
     * @return Shape2D
     */
    public static Shape2D findLongestPerimeter(Shape2D[] shapes) {

        double largestPerimeterValue = 0;
        int largestPerimeterIndex = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].calculatePerimeter() > largestPerimeterValue) {
                largestPerimeterValue = shapes[i].calculatePerimeter();
                largestPerimeterIndex = i;
            }
        }

        return shapes[largestPerimeterIndex];
    }

    public static void main(String[] args) {

        // UNIT TESTING

        // create new ArrayList for shapes
        Shape2D[] shapes = new Shape2D[3];

        // create three shapes
        shapes[0] = new Rectangle(2, 3, 8, 15);
        shapes[1] = new Circle(13, 15, 3.0);
        shapes[2] = new Square(-2, -5, 5);

        // create three squares
        Shape2D sq2 = new Square(-2, -5, 5);
        Shape2D sq3 = new Square(-1, -5, 5);
        Shape2D sq4 = null;

        // print string representation of shapes created
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());
        System.out.println("sq: " + shapes[2].toString());
        System.out.println("sq2: " + sq2.toString());
        System.out.println("sq3: " + sq3.toString());
        System.out.println("sq4: " + sq4);

        // test if shapes equal to each other
        System.out.println("sq. equals ( sq2 ) is " + shapes[2].equals(sq2));
        System.out.println("sq. equals ( sq3 ) is " + shapes[2].equals(sq3));
        System.out.println("sq. equals ( circle ) is " + shapes[2].equals(shapes[1]));

        System.out.println("The shape array:[" + shapes[0].toString() + ", " + shapes[1].toString() + " and "
                + shapes[2].toString() + "]");

        // determine which shape is largest
        System.out.println(findLargestArea(shapes).getClass() + " has largest area");
        System.out.println(findLongestPerimeter(shapes).getClass() + " has longest perimeter");

        // print distance between shapes
        System.out.println("Distance between shape 1 and 2 is " + shapes[0].calculateDistance(shapes[1]));
        System.out.println("Distance between shape 1 and 3 is " + shapes[0].calculateDistance(shapes[2]));
        System.out.println("Distance between shape 2 and 3 is " + shapes[1].calculateDistance(shapes[2]));

        // END OF UNIT TESTING
    }

}
