package Int101Week06.geometry;

public class Rectangle {
    private static final double MINIMUM_SIZE = 1.0;
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0.0 || length < 0.0) {
            throw new RuntimeException("Width and Length can not be zero or less");
        }
        double temp;
        if (width > length) {
            temp = width;
            width = length;
            length = temp;
        }
        this.width = (width > MINIMUM_SIZE) ? width : MINIMUM_SIZE; // Conditional Expression
        this.length = (length > MINIMUM_SIZE) ? length : MINIMUM_SIZE; // Conditional Expression
    }    // Ternary Expression :: boolean-expression ? true-expression : false-expression
    // e = a==b ? c() : d(); // x()  && y()

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
