package task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Circle Area: " + circle.area());
        Cube cube = new Cube(4.0);
        System.out.println("Cube Volume: " + cube.volume(4.0));

        Pyramide pyramid = new Pyramide(6.0, 8.0, 10.0, 12.0);
        System.out.println("Pyramid Area: " + pyramid.area(12.0));
        System.out.println("Pyramid Volume: " + pyramid.volume());

        Rectangle rectangle = new Rectangle(6.0, 8.0);
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());

        Sphere sphere = new Sphere(3.0);
        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());

        Square square = new Square(4.0);
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("Square Area: " + square.area());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
    }
}
