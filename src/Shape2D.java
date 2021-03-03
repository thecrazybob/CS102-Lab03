
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

        return "x =" + this.x + "," + " y = " + this.y;

    }

    public boolean equals(Object o) {

        return (this.x == ((Shape2D) o).x && y == ((Shape2D) o).y);

    }
}
