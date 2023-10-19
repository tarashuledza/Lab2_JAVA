package task2;

public class Cube {
    private final double side;

    public Cube(final double side) {
        this.side = side;
    }
    public double volume(final double side) {
        return Math.pow(side, 3);
    }
}
