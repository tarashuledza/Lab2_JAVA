package task2;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double perimeter() {
        return side * 4;
    }

    public double area() {
        return Math.pow(side, 2);
    }
}
