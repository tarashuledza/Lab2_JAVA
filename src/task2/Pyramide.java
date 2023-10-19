package task2;

public class Pyramide {
    private final Triangle baseArea;
    private final double height;

    public Pyramide(final double firstBaseSide, final double secondBaseSide, final double thirdBaseSide,
                   final double height) {
        this.baseArea = new Triangle(firstBaseSide, secondBaseSide, thirdBaseSide);
        this.height = height;
    }

    public double area(final double height) {
        return 0.5 * baseArea.perimeter() * this.height + baseArea.area();
    }

    public double volume() {
        return baseArea.area() * height;
    }

}
