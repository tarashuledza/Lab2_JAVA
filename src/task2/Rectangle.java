package task2;

public class Rectangle {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double perimeter() {
        return 2 * firstSide + 2 * secondSide;
    }

    public double area() {
        return firstSide * secondSide;
    }
}
